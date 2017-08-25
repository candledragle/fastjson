package com.alibaba.json.test.sym.bean;


import java.util.List;

/**
 * Created by sym on 17/8/15.
 */

public class ChoiceHouseBean implements IBaseBean<ChoiceHouseBean.DataEntity> {

    private int code = 200;
    private DataEntity data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }


    /**
     * code : 0
     * data : {"reportDetail":[{"count":0,"id":"string","title":"string"}],"qdCode":101,"pageNo":0,
     * "pageSize":0,"toalCount":0,"message":"string","toast":"string"}
     */

    public static class DataEntity implements IBaseBean.DataEntity {
        /**
         * reportDetail : [{"count":0,"id":"string","title":"string"}]
         * qdCode : 101
         * pageNo : 0
         * pageSize : 0
         * toalCount : 0
         * message : string
         * toast : string
         */

        private int qdpCode = 100;
        private int pageNo = 0;
        private int pageSize = 20;
        private int toalCount = 100;
        private String message = "成功";
        private String toast;
        private List<ListEntity> reportDetail;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getToalCount() {
            return toalCount;
        }

        public void setToalCount(int toalCount) {
            this.toalCount = toalCount;
        }

        public int getQdpCode() {
            return qdpCode;
        }

        public void setQdpCode(int qdpCode) {
            this.qdpCode = qdpCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getToast() {
            return toast;
        }

        public void setToast(String toast) {
            this.toast = toast;
        }

        public List<ListEntity> getReportDetail() {
            return reportDetail;
        }

        public void setReportDetail(List<ListEntity> reportDetail) {
            this.reportDetail = reportDetail;
        }

        public static class ListEntity {
            /**
             * count : 0
             * id : string
             * title : string
             */

            private int count = 20;
            private String id = "101";
            private String title = "贵园南里一期";

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
