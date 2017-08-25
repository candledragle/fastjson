package com.alibaba.json.test.sym.bean;

import java.util.List;

/**
 * Created by sym on 17/8/23.
 */

public interface IRefreshDataEntity<T> extends IBaseBean.DataEntity {

    public List<T> getList();

    public void setList(List<T> list);

}
