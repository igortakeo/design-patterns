
public class Pizzaria {

	public Pizza createCheesePizza(PizzaBuilder builder, int size) {
		builder.setSize(size);
		builder.withCheese();
		return builder.getPizza();
	}
	
	public Pizza createChickenPizza(PizzaBuilder builder, int size) {
		builder.setSize(size);
		builder.withCheese();
		builder.withChicken();
		return builder.getPizza();
	}
	
	public Pizza createAmericanPizza(PizzaBuilder builder, int size) {
		builder.setSize(size);
		builder.withCheese();
		builder.withBacon();
		builder.withEgg();
		builder.withTomato();
		builder.withOnion();
		return builder.getPizza();
	}
	
}
