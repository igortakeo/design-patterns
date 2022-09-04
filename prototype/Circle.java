public class Circle extends Shape {

    public int radius;

    public Circle(){
    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }

    @Override
    protected Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle)) return false;
        if(!super.equals(obj)) return false;
        Circle circleClone = (Circle) obj;

        return circleClone.radius == this.radius;
    }
}
