package com.alibaba.json.test.sym.bean;

/**
 * Created by sym on 17/8/17.
 */

public interface IBaseBean<T> {


    public int getCode();

    public void setCode(int code);

    public T getData();

    public void setData(T data);

    public static interface DataEntity {

        public int getQdpCode();

        public void setQdpCode(int qdpCode);

        public String getMessage();

        public void setMessage(String message);

        public String getToast();

        public void setToast(String toast);
    }
}
