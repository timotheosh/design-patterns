package com.selfdidactic.app;

import com.selfdidactic.duck.Duck;
import com.selfdidactic.duck.Quack;
import com.selfdidactic.duck.FlyRocketPowered;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
