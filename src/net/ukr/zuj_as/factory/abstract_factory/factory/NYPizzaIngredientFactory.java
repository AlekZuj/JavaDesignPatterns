package net.ukr.zuj_as.factory.abstract_factory.factory;

import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.Cheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.ReggianoCheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.Clams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.FreshClams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.Dough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.ThinCrustDough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.Pepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.SlicedPepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.MarinaraSauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.Sauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
