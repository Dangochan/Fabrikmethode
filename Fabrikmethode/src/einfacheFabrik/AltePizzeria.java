package einfacheFabrik;


public class AltePizzeria {
	public Pizza bestellePizza( String typ)
	{
		Pizza pizza = null;
		if(typ.equalsIgnoreCase("Salami")) pizza = new SalamiPizza();
		if(typ.equalsIgnoreCase("Schinken")) pizza = new SchinkenPizza();
		if(typ.equalsIgnoreCase("Spinat")) pizza = new SpinatPizza();
		if(typ.equalsIgnoreCase("Thunfisch")) pizza = new ThunfischPizza();
		if(typ.equalsIgnoreCase("Krabben")) pizza = new KrabbenPizza();
			
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
			
			
		return pizza;
	}

}
