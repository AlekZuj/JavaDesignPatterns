package net.ukr.zuj_as.factory.abstract_factory.pizza;

import net.ukr.zuj_as.factory.abstract_factory.ingridients.cheese.Cheese;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.clams.Clams;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.dough.Dough;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.pepperoni.Pepperoni;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.sauce.Sauce;
import net.ukr.zuj_as.factory.abstract_factory.ingridients.veggies.Veggies;

public abstract class Pizza {

	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggies veggies[];
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClam() {
		return clam;
	}

	public void setClam(Clams clam) {
		this.clam = clam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
