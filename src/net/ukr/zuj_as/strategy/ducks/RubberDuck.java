package net.ukr.zuj_as.strategy.ducks;

import net.ukr.zuj_as.strategy.fly.FlyNoWay;
import net.ukr.zuj_as.strategy.quack.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
