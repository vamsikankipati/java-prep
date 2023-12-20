package com.designpatterns.headfirst.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .35;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
