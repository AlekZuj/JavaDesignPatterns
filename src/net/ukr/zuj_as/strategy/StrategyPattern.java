package net.ukr.zuj_as.strategy;

import net.ukr.zuj_as.strategy.ducks.*;
import net.ukr.zuj_as.strategy.fly.FlyWithRocketPower;

public class StrategyPattern {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("______________");

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performFly();
        redHead.performQuack();

        System.out.println("______________");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("______________");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("______________");

        decoy.setFlyBehavior(new FlyWithRocketPower());
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
    }
}
