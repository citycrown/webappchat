package com.bootdo.common.utils;

/**
 * 泛型
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/15
 */
public class Test<T> {

    private T td;

    public Test(T td) {
        this.td = td;
    }

    public T getTd() {
        return td;
    }

    public void setTd(T td) {
        this.td = td;
    }

    public void showType() {

        System.out.println("T的实际类型是: " + td.getClass().getName());

    }
}
