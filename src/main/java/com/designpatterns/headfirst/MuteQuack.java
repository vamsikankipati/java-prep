package com.designpatterns.headfirst;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(":: Silence ::");
    }
}
