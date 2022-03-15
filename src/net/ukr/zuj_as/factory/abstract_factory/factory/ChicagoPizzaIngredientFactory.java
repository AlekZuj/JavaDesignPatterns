package net.ukr.zuj_as.factory.abstract_factory.factory;

import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.Cheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.MozzarellaCheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.Clams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.FrozenClams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.Dough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.ThickCrustDough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.Pepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.SlicedPepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.PlumTomatoSauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.Sauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.BlackOlives;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.Eggplant;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.Spinach;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
