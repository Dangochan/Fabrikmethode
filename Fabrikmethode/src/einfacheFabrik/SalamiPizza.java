package einfacheFabrik;


public class SalamiPizza extends Pizza {
	public SalamiPizza()
	{
		name = "Salamipizza";
		teig = "Teig";
		so�e = "Tomatenso�e";
		
		belaege.add("Salami");
		belaege.add("Peperoni");
		belaege.add("Mozarella");
	}

}
