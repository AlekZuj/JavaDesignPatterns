package net.ukr.zuj_as.factory.abstract_factory.factory;

import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.Cheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.Clams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.Dough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.Pepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.Sauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}
