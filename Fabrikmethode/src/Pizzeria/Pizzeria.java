package Pizzeria;
import Pizzas.BerlinerKrabbenPizza;
import Pizzas.BerlinerSalamiPizza;
import Pizzas.BerlinerSchinkenPizza;
import Pizzas.BerlinerThunfischPizza;
import Pizzas.KoelnerKrabbenPizza;
import Pizzas.KoelnerSalamiPizza;
import Pizzas.KoelnerSchinkenPizza;
import Pizzas.KoelnerThunfischPizza;
import Pizzas.Pizza;


public class Pizzeria {
	public Pizza bestellePizza(String art, String typ)
	{
		Pizza pizza = null;
		if(art.equalsIgnoreCase("Köln"))
		{
			if(typ.equalsIgnoreCase("Salami")) pizza = new KoelnerSalamiPizza();
			if(typ.equalsIgnoreCase("Schinken")) pizza = new KoelnerSchinkenPizza();
			if(typ.equalsIgnoreCase("Thunfisch")) pizza = new KoelnerThunfischPizza();
			if(typ.equalsIgnoreCase("Krabben")) pizza = new KoelnerKrabbenPizza();
		}
		if(art.equalsIgnoreCase("Berlin"))
		{
			if(typ.equalsIgnoreCase("Salami")) pizza = new BerlinerSalamiPizza();
			if(typ.equalsIgnoreCase("Schinken")) pizza = new BerlinerSchinkenPizza();
			if(typ.equalsIgnoreCase("Thunfisch")) pizza = new BerlinerThunfischPizza();
			if(typ.equalsIgnoreCase("Krabben")) pizza = new BerlinerKrabbenPizza();
		}
		if(pizza != null)
		{
			pizza.vorbereiten();
			pizza.backen();
			pizza.schneiden();
			pizza.verpacken();
		}
		
		return pizza;
	}

}
