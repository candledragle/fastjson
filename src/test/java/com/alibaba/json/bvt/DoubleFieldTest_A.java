package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DoubleFieldTest_A extends TestCase {

    public void test_codec() throws Exception {
        User user = new User();
        user.setValue(1001D);

        SerializeConfig mapping = new SerializeConfig();
        
        String text = JSON.toJSONString(user, mapping, SerializerFeature.WriteMapNullValue);
        System.out.println(text);

        User user1 = JSON.parseObject(text, User.class);

        Assert.assertEquals(user1.getValue(), user.getValue());
    }

    public void test_codec_null() throws Exception {
        User user = new User();
        user.setValue(null);

        SerializeConfig mapping = new SerializeConfig();
        
        String text = JSON.toJSONString(user, mapping, SerializerFeature.WriteMapNullValue);
        System.out.println(text);

        User user1 = JSON.parseObject(text, User.class);

        Assert.assertEquals(user1.getValue(), user.getValue());
    }

    public static class User {

        private Double value;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

    }
}
