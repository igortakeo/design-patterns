//Concrete Factory
public class VictorianFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}
	

}
