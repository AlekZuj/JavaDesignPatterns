package net.ukr.zuj_as.decorator.condiment;

import net.ukr.zuj_as.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
