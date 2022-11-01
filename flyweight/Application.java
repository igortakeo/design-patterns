public class Application {
    public static void main(String[] args){
        Forest forest = new Forest();
        forest.plantTree(0, 0, "tree-1", "green", "otherData");
        forest.plantTree(1, 1, "tree-1", "green", "otherData");
        forest.plantTree(1, 2, "tree-2", "black", "otherData");

        forest.paint();
    }
}
