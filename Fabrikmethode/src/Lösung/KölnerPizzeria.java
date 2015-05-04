package Lösung;
import Pizzas.KoelnerKrabbenPizza;
import Pizzas.KoelnerSalamiPizza;
import Pizzas.KoelnerSchinkenPizza;
import Pizzas.KoelnerThunfischPizza;
import Pizzas.Pizza;


public class KölnerPizzeria extends Pizzeria{
	@Override
	public Pizza erstellePizza(String typ)
	{
		Pizza pizza = null;
		if(typ.equalsIgnoreCase("Salami")) pizza = new KoelnerSalamiPizza();
		if(typ.equalsIgnoreCase("Schinken")) pizza = new KoelnerSchinkenPizza();
		if(typ.equalsIgnoreCase("Thunfisch")) pizza = new KoelnerThunfischPizza();
		if(typ.equalsIgnoreCase("Krabben")) pizza = new KoelnerKrabbenPizza();
		return pizza;
	}

}
