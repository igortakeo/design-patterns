
public class PizzaBuilder {
	
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean tomato;
	private boolean egg;
	private boolean bacon;
	private boolean chicken;
	private boolean onion;

	public void setSize(int size) {
		this.size = size;
	}

	public void withCheese() {
		this.cheese = true;
	}

	public void withPepperoni() { 
		this.pepperoni = true;
	}

	public void withTomato() {
		this.tomato = true;
	}

	public void withEgg() {
		this.egg = true;
	}

	public void withBacon() {
		this.bacon = true;
	}

	public void withChicken() {
		this.chicken = true;
	}
	
	public void withOnion() {
		this.onion = true;
	}
	
	private void resetPizza() {
		this.size = 0;
		this.cheese = false;
		this.pepperoni = false;
		this.tomato = false;
		this.egg = false;
		this.bacon = false;
		this.chicken = false;
		this.onion = false;
	}
	
	public Pizza getPizza() {
		Pizza pizza = new Pizza (
			this.size,
			this.cheese,
			this.pepperoni,
			this.tomato,
			this.egg,
			this.bacon,
			this.chicken,
			this.onion
		);
		
		resetPizza();
		
		return pizza;
	}

}
