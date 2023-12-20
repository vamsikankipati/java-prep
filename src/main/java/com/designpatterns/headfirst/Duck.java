package com.designpatterns.headfirst;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        // instantiating fly behaviour is delegated to FlyBehaviour subtype by Duck
        flyBehaviour.fly();
    }

    public void performQuack() {
        // instantiating quack behaviour is delegated to QuackBehaviour subtype by Duck
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
