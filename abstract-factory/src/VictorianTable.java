
public class VictorianTable implements Table{

	private final int SIZE = 20;
	private final int PRICE = 40;
	
	@Override
	public int sizeOfTable() {
		return this.SIZE;
	}

	@Override
	public int getPrice() {
		return this.PRICE;
	}
	
}
