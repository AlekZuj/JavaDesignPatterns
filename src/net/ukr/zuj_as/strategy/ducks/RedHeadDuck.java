package net.ukr.zuj_as.strategy.ducks;

import net.ukr.zuj_as.strategy.fly.FlyWithWings;
import net.ukr.zuj_as.strategy.quack.Squeak;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm red head duck!");
    }
}
