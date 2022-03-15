package net.ukr.zuj_as.decorator.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
