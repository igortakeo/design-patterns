import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one type of chair: Modern or Victorian");
		String chairType = sc.nextLine();
		ChairStore store;
		FurnitureFactory factory;
		
		if(chairType.contains("Modern")) {
			factory = new ModernFactory();
		}
		else if(chairType.contains("Victorian")) {
			factory = new VictorianFactory();
		}
		else {
			System.out.println("Incorrect input");
			return;
		}
		
		store = new ChairStore(factory);
		
		System.out.println("Has legs: " + store.hasLegs());
		System.out.println("Price: " + store.getPrice());
	}
}
