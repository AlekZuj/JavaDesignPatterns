package net.ukr.zuj_as.strategy.ducks;

import net.ukr.zuj_as.strategy.fly.FlyNoWay;
import net.ukr.zuj_as.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm decoy duck!");
    }
}
