
package com.legend.springbootjpademo.enumeration;

/**
 * @Title EnumEventType
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/11/23 11:43
 */

 public enum EnumRecordStatus {

    exist("存在", 0),

    hide("隐藏", 1),

    deleted("已删除", 2);


    private String name ;
    private int index ;
    private EnumRecordStatus(String name , int index ){
        this.name = name ;
        this.index = index ;
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
                    