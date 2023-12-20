package com.designpatterns.headfirst;

public class MallardDuck extends Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
