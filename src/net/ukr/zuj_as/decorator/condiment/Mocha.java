package net.ukr.zuj_as.decorator.condiment;

import net.ukr.zuj_as.decorator.beverage.Beverage;
import net.ukr.zuj_as.decorator.beverage.Size;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
