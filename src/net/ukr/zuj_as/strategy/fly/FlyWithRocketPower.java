package net.ukr.zuj_as.strategy.fly;

public class FlyWithRocketPower implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm rocket!");
    }
}
