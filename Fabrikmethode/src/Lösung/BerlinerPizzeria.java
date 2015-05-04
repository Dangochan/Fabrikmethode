package Lösung;
import Pizzas.BerlinerKrabbenPizza;
import Pizzas.BerlinerSalamiPizza;
import Pizzas.BerlinerSchinkenPizza;
import Pizzas.BerlinerThunfischPizza;
import Pizzas.Pizza;


public class BerlinerPizzeria extends Pizzeria {
	@Override
	public Pizza erstellePizza(String typ)
	{
		Pizza pizza = null;
		if(typ.equalsIgnoreCase("Salami")) pizza = new BerlinerSalamiPizza();
		if(typ.equalsIgnoreCase("Schinken")) pizza = new BerlinerSchinkenPizza();
		if(typ.equalsIgnoreCase("Thunfisch")) pizza = new BerlinerThunfischPizza();
		if(typ.equalsIgnoreCase("Krabben")) pizza = new BerlinerKrabbenPizza();
			
		return pizza;
	}

}
