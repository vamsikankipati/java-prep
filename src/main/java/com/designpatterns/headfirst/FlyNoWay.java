package com.designpatterns.headfirst;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println(":: Fly behaviour - I can't fly ::");
    }
}
