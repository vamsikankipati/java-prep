package com.designpatterns.headfirst;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println(":: Fly behaviour invoked with Wings ::");
    }
}
