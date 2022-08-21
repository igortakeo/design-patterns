
public class Store {

	private Chair chair;
	private Table table;
	
	public Store(FurnitureFactory factory) {
		this.chair  = factory.createChair();
		this.table = factory.createTable();
	}
	
	public int getChairPrice() {
		return this.chair.getPrice();
	}
	
	public int getTablePrice() {
		return this.table.getPrice();
	}
	
	public boolean chairHasLegs() {
		return this.chair.hasLegs();
	}
	
	public int getTableSize() {
		return this.table.sizeOfTable();
	}
}
