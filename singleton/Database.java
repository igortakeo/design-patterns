
public class Database {
    private static Database database;
    public String name;

    private Database(String name){
        this.name = name;
    }

    public static Database getInstance(String value){
        if (database == null){
            database = new Database(value);
        }
        return database;
    }

}
