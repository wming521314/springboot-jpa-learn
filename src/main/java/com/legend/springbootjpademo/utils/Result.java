package com.legend.springbootjpademo.utils;

import com.legend.springbootjpademo.enumeration.EnumErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(value = "Result",description = "通用返回对象")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

	@ApiModelProperty(value = "错误码",name = "errorCode")
	private int errorCode;

	@ApiModelProperty(value = "请求成功时返回的数据",name = "data")
	private T data;

	@ApiModelProperty(value = "请求错误提示",name = "errorMsg")
	private String errorMsg;

	public Result ok(T data) {
		return new Result(EnumErrorCode.success.getIndex(), data, null);
	}

	public static Result error(int errorCode, String errorMsg) {
		return new Result(errorCode, null, errorMsg);
	}

	@Override
	public String toString() {
		return "Result{" +
				"errorCode=" + errorCode +
				", data=" + data +
				", errorMsg='" + errorMsg + '\'' +
				'}';
	}
}
