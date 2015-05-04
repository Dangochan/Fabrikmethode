package einfacheFabrik;

public class EinfachePizzaFabrik {
	public Pizza erstellePizza(String typ)
	{
		Pizza pizza = null;
		if(typ.equalsIgnoreCase("Salami")) pizza = new SalamiPizza();
		if(typ.equalsIgnoreCase("Schinken")) pizza = new SchinkenPizza();
		if(typ.equalsIgnoreCase("Spinat")) pizza = new SpinatPizza();
		
		return pizza;
	}
}
