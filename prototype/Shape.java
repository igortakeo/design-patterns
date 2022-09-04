import java.util.Objects;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }
 
    public Shape(Shape target){
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Shape)) return false;
        Shape shapeClone = (Shape) obj;
        return shapeClone.x == this.x && shapeClone.y == this.y && Objects.equals(shapeClone.color, this.color);
    }

}
