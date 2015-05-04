package Lösung;
import Pizzas.Pizza;


public abstract class Pizzeria {
	public abstract Pizza erstellePizza(String typ);
	
	public Pizza bestellePizza(String typ)
	{
		Pizza pizza = erstellePizza(typ);
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
			
		
		return pizza;
	}

}
