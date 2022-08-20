
public class VictorianChair implements Chair{
	
	public final int PRICE = 20;

	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public int getPrice() {
		return this.PRICE;
	}

}
