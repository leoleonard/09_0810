package one;

public class CalculatorTest {
    public static void main(String[] args) {
        Line2D line2D = new Line2D(1, 5, 2, 8);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 8);
        Ball ball = new Ball(8);
        Cube cube = new Cube(8);

        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Line lenght = " + calculator.lineLength(line2D));
        System.out.println("Circle area = " + calculator.circleArea(circle));
        System.out.println("Rectangle area = " + calculator.rectangleArea(rectangle) );
        System.out.println("Ball volume = " + calculator.ballVollume(ball));
        System.out.println("Cube volume = " + calculator.cubeVolume(cube));

    }
}
