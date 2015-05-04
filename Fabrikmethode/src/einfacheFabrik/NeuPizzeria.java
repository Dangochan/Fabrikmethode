package einfacheFabrik;


public class NeuPizzeria {
	private EinfachePizzaFabrik fabrik;
	
	public NeuPizzeria()
	{
		fabrik = new EinfachePizzaFabrik();
	}
	
	public Pizza bestellePizza( String typ)
	{
		Pizza pizza = fabrik.erstellePizza(typ);
			
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
			
			
		return pizza;
	}

}
