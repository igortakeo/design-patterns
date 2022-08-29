
public class Pizzaria {

	public Pizza createCheesePizza(PizzaBuilder builder) {
		builder.setSize(20);
		builder.withCheese();
		return builder.getPizza();
	}
	
	public Pizza createCHickenPizza(PizzaBuilder builder) {
		builder.setSize(20);
		builder.withCheese();
		builder.withChicken();
		return builder.getPizza();
	}
	
	public Pizza createAmericanPizza(PizzaBuilder builder) {
		builder.setSize(20);
		builder.withCheese();
		builder.withBacon();
		builder.withEgg();
		builder.withTomato();
		builder.withOnion();
		return builder.getPizza();
	}
	
}
