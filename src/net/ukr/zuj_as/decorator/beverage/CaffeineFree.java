package net.ukr.zuj_as.decorator.beverage;

public class CaffeineFree extends Beverage{

    public CaffeineFree() {
        description = "Caffeine Free";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
