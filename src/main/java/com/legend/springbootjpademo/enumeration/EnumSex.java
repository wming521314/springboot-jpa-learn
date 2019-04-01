
package com.legend.springbootjpademo.enumeration;

/**
 * @Title EnumSex
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/11/23 11:43
 */

public enum EnumSex {

    success("未知", 0),

    man("男", 1),

    women("女", 2);

    private String name;
    private int index;

    private EnumSex(String name, int index) {
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

    public static String getDesc(Integer value) {
        EnumSex[] enumSexList = values();
        for (EnumSex enumSex : enumSexList) {
            if (enumSex.index == value) {
                return enumSex.name;
            }
        }
        return null;
    }
}