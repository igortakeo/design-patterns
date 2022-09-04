
public class Application {

    public static void main(String args[]) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "green";

        Circle anotherCircle = new Circle();
        anotherCircle.x = 15;
        anotherCircle.y = 25;
        anotherCircle.radius = 35;
        anotherCircle.color = "red";

        Circle circleClone = circle.clone();
        
        System.out.println("Comparation 1: ----------------\n");
        compareCircles(circle, circleClone);

        System.out.println("Comparation 2: ----------------\n");
        compareCircles(anotherCircle, circleClone);

    }

    public static void compareCircles(Circle circle, Circle circleClone){
        if(circle.equals(circleClone)){
            System.out.println("Circles are equal !!");
        }
        else {
            System.out.println("Circles aren't equal");
        }

        System.out.println("X: " + circle.x + " / " +  circleClone.x);
        System.out.println("Y: " + circle.y + " / " +  circleClone.y);
        System.out.println("Radius: " + circle.radius + " / " +  circleClone.radius);
        System.out.println("Color: " + circle.color + " / " +  circleClone.color);
    }
}
