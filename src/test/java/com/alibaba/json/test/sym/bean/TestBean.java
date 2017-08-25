package com.alibaba.json.test.sym.bean;

import java.util.List;

/**
 * Created by sym on 17/8/25.
 */
public class TestBean {

    /**
     * code : 1
     * data : {"message":"成功","pageNo":1,"pageSize":1,"qdpCode":1,"reportDetail":[{"count":1,
     * "id":"101","title":"贵园南里一期"},{"count":1,"id":"101","title":"贵园南里一期"},{"count":1,
     * "id":"101","title":"贵园南里一期"},{"count":1,"id":"101","title":"贵园南里一期"},{"count":1,
     * "id":"101","title":"贵园南里一期"}],"toalCount":1,"toast":"就不呵呵呵"}
     */

    public int code;
    public DataEntity data;

    public static class DataEntity {
        /**
         * message : 成功
         * pageNo : 1
         * pageSize : 1
         * qdpCode : 1
         * reportDetail : [{"count":1,"id":"101","title":"贵园南里一期"},{"count":1,"id":"101",
         * "title":"贵园南里一期"},{"count":1,"id":"101","title":"贵园南里一期"},{"count":1,"id":"101",
         * "title":"贵园南里一期"},{"count":1,"id":"101","title":"贵园南里一期"}]
         * toalCount : 1
         * toast : 就不呵呵呵
         */

        public String message;
        public int pageNo;
        public int pageSize;
        public int qdpCode;
        public int toalCount;
        public String toast;
        public List<ReportDetailEntity> reportDetail;

        public static class ReportDetailEntity {
            /**
             * count : 1
             * id : 101
             * title : 贵园南里一期
             */

            public int count;
            public String id;
            public String title;
        }
    }
}
