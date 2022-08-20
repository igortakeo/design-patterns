
public class ChairStore {

	private Chair chair;
	
	public ChairStore(FurnitureFactory factory) {
		this.chair  = factory.createChair();
	}
	
	public int getPrice() {
		return this.chair.getPrice();
	}
	
	public boolean hasLegs() {
		return this.chair.hasLegs();
	}
}
