package Pizzeria;

public class PizzeriaOrder {

	public static void main(String[] args) {
		Pizzeria pizzeria = new Pizzeria();
		
		System.out.println(pizzeria.bestellePizza("Berlin", "Krabben"));
		
		System.out.println(pizzeria.bestellePizza("Köln", "Salami"));
	}
}
