
public class Application {

    public static void main(String args[]) {
        Database myDatabase = Database.getInstance("igor");
        Database anotherDatabase = Database.getInstance("joao");

        System.out.println(myDatabase.name);
        System.out.println(anotherDatabase.name);
    }
}
