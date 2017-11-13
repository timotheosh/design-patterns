package com.selfdidactic.app;

import com.selfdidactic.duck.Duck;
import com.selfdidactic.duck.Quack;
import com.selfdidactic.duck.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
