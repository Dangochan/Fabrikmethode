package L�sung;


public class PizzeriaOrder {

	public static void main(String[] args) {
		
		Pizzeria pizzeria = new BerlinerPizzeria();
		System.out.println(pizzeria.bestellePizza("Krabben"));
		
		pizzeria = new K�lnerPizzeria();
		System.out.println(pizzeria.bestellePizza("Salami"));
		
	}
}
