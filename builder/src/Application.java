
public class Application {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		Pizzaria pizzaria = new Pizzaria();
		
		Pizza cheese = pizzaria.createCheesePizza(pizzaBuilder, 20);
		Pizza american = pizzaria.createAmericanPizza(pizzaBuilder, 10);
		
		
		System.out.println(cheese.toString());
		System.out.println(american.toString());
	}
}
