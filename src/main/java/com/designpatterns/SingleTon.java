package com.designpatterns;

public class SingleTon {
    private static SingleTon singleTonObj;

    public static SingleTon getInstance() {
        if (null == singleTonObj) {
            synchronized (SingleTon.class) {
                if (null == singleTonObj) {
                    singleTonObj = new SingleTon();
                }
            }
        }
        return singleTonObj;
    }
}
