
public class ModernChair implements Chair{
	
	private final int PRICE = 30;

	@Override
	public boolean hasLegs() {
		return false;
	}

	@Override
	public int getPrice() {
		return this.PRICE;
	}
	
}
