package net.ukr.zuj_as.decorator;

import net.ukr.zuj_as.decorator.beverage.*;
import net.ukr.zuj_as.decorator.condiment.Mocha;
import net.ukr.zuj_as.decorator.condiment.Soy;
import net.ukr.zuj_as.decorator.condiment.Whip;

public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("------------------------------");
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        System.out.println("------------------------------");
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
