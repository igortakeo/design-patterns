import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one type of chair: Modern or Victorian");
		String type = sc.nextLine();
		Store store;
		FurnitureFactory factory;
		
		if(type.contains("Modern")) {
			factory = new ModernFactory();
		}
		else if(type.contains("Victorian")) {
			factory = new VictorianFactory();
		}
		else {
			System.out.println("Incorrect input");
			sc.close();
			return;
		}
		
		store = new Store(factory);
		
		System.out.println("Chair has legs: " + store.chairHasLegs());
		System.out.println("Chair price: " + store.getChairPrice());
		System.out.println("Table price: " + store.getTablePrice());
		System.out.println("Table size: " + store.getTableSize());
		sc.close();
	}
}
