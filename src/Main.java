public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Square square = new Square(2.0);
        Pentagon pentagon = new Pentagon(3.0);

        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Периметр пятиугольника: " + pentagon.getPerimeter());
    }
}