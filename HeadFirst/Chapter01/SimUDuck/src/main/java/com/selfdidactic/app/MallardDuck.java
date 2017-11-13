package com.selfdidactic.app;

import com.selfdidactic.duck.Duck;
import com.selfdidactic.duck.Quack;
import com.selfdidactic.duck.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
