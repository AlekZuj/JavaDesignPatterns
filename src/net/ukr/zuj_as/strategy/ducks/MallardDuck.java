package net.ukr.zuj_as.strategy.ducks;

import net.ukr.zuj_as.strategy.fly.FlyWithWings;
import net.ukr.zuj_as.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck!");
    }
}
