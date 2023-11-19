public class Pentagon extends Shape{

    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 5 * side;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "side=" + side +
                "} " + super.toString();
    }
}
