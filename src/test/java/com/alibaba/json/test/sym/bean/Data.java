package com.alibaba.json.test.sym.bean;

import javax.annotation.Generated;
import java.util.List;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@SerializedName("qdpCode")
	private int qdpCode;

	@SerializedName("message")
	private String message;

	@SerializedName("pageNo")
	private int pageNo;

	@SerializedName("pageSize")
	private int pageSize;

	@SerializedName("toalCount")
	private int toalCount;

	@SerializedName("reportDetail")
	private List<ReportDetailItem> reportDetail;

	@SerializedName("toast")
	private String toast;
}