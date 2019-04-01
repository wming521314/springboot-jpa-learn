
package com.legend.springbootjpademo.enumeration;

/**
 * @Title EnumEventType
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/11/23 11:43
 */

public enum EnumErrorCode {

    success("成功", 0),

    empty("查询成功但数据为空(不再使用)", 1),

    tokenError("token错误", 2),

    parameterError("参数错误", 3),

    serverError("服务器错误", 4);


    private String name;
    private int index;

    private EnumErrorCode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}