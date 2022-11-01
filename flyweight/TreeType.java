// State shared betrween trees

public class TreeType {
    private String name;
    private String color;
    private String otherTreeData;

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }
    
    public void draw(int x, int y){
        System.out.println("Points: " + x + " / " + y);
        System.out.println(name);
        System.out.println(color);
        System.out.println(otherTreeData);
        System.out.println("----------------------");
    }
}
