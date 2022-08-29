
public class Pizza {

	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean tomato;
	private boolean egg;
	private boolean bacon;
	private boolean chicken;
	private boolean onion;
	
	
	public Pizza(int size, boolean cheese, boolean pepperoni, boolean tomato, boolean egg, boolean bacon,
			boolean chicken, boolean onion) {
		this.size = size;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.tomato = tomato;
		this.egg = egg;
		this.bacon = bacon;
		this.chicken = chicken;
		this.onion = onion;
	}


	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", tomato=" + tomato
				+ ", egg=" + egg + ", bacon=" + bacon + ", chicken=" + chicken + ", onion=" + onion + "]";
	}

	
}
