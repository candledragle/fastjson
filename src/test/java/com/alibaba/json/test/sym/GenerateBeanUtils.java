package com.alibaba.json.test.sym;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sym on 17/8/25.
 */
public class GenerateBeanUtils {

    /**
     * 生成测试数据
     *
     * @return
     */
    public <E> String generateTestData(Class<E> clazz1, final Properties properties) {

        String json = "";
        try {

            E instance = clazz1.newInstance();

            ValueFilter valueFilter = new ValueFilter() {

                public Object process(Object object, String name, Object value) {
                    try {

                        if (null != mListener) {
                            mListener.onJsonHandle(object);
                        }

                        Field field = object.getClass().getDeclaredField(name);
                        field.setAccessible(true);
                        Class<?> clazz = field.getType();

                        if (clazz == String.class) {
                            if (value == null) {
                                return properties.aString;
                            } else {
                                return value;
                            }
                        } else if (clazz == Integer.TYPE) {

                            return properties.aInt;
                        } else if (clazz == Boolean.TYPE) {

                            return properties.aBoolean;

                        } else if (clazz == Long.TYPE) {

                            return properties.aLong;
                        } else if (List.class.isAssignableFrom(clazz)) {

                            Type genericType = field.getGenericType();
                            if (genericType == null) {
                                return null;
                            }

                            Class genericClazz = null;
                            if (genericType instanceof ParameterizedType) {
                                ParameterizedType pt = (ParameterizedType) genericType;
                                genericClazz = (Class) pt.getActualTypeArguments()[0];
                            }
                            value = new ArrayList();
                            List list = (List) value;
                            for (int i = 0; i < 5; i++) {
                                Object child = genericClazz.newInstance();
                                list.add(child);
                            }

                            return value;
                        } else {

                            return clazz.newInstance();
                        }

                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }


                    return value;
                }
            };

            json = JSON.toJSONString(instance, valueFilter, SerializerFeature.WriteMapNullValue);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return json;
    }

    public OnJsonHandleListener mListener;

    public GenerateBeanUtils setListener(OnJsonHandleListener listener) {
        this.mListener = listener;

        return this;
    }

    public interface OnJsonHandleListener<E> {

        /**
         * @param object propertyName
         */
        public abstract  void onJsonHandle(E object);
    }
}
