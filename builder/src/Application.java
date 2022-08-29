
public class Application {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		Pizzaria pizzaria = new Pizzaria();
		
		Pizza cheese = pizzaria.createCheesePizza(pizzaBuilder);
		Pizza american = pizzaria.createAmericanPizza(pizzaBuilder);
		
		
		System.out.println(cheese.toString());
		System.out.println(american.toString());
	}
}
