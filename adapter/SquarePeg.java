public class SquarePeg {
    private double width;

    public SquarePeg() {
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return this.width*this.width;
    }
}
