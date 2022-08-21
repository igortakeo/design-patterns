
public class ModernTable implements Table{
	
	private final int SIZE = 25;
	private final int PRICE = 50;

	@Override
	public int sizeOfTable() {
		return this.SIZE;
	}

	@Override
	public int getPrice() {
		return this.PRICE;
	}

}
