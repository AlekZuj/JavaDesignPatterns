package net.ukr.zuj_as.factory.abstract_factory.pizza;

import net.ukr.zuj_as.factory.abstract_factory.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(ingredientFactory.createDough());
		super.setSauce(ingredientFactory.createSauce());
		super.setCheese(ingredientFactory.createCheese());
		super.setVeggies(ingredientFactory.createVeggies());
	}
}
