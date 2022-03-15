package net.ukr.zuj_as.decorator.condiment;

import net.ukr.zuj_as.decorator.beverage.Beverage;
import net.ukr.zuj_as.decorator.beverage.Size;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost =  0.15 + beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.1;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.2;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
