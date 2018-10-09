package one;

public class CalculatorTest {
    public static void main(String[] args) {
//        Line2D line2D = new Line2D(1, 5, 2, 8);
//        Circle circle = new Circle(5);
//        Rectangle rectangle = new Rectangle(5, 8);
//        Ball ball = new Ball(8);
//        Cube cube = new Cube(8);
//
        ShapeCalculator calculator = new ShapeCalculator();
//
//        System.out.println("Line lenght = " + calculator.lineLength(line2D));
//        System.out.println("Circle area = " + calculator.circleArea(circle));
//        System.out.println("Rectangle area = " + calculator.rectangleArea(rectangle) );
//        System.out.println("Ball volume = " + calculator.ballVollume(ball));
//        System.out.println("Cube volume = " + calculator.cubeVolume(cube));

        Shape[] array = new Shape[5];
        array[0] = new Line2D(05,3,4, 3);
        array[1] = new Circle(4);
        array[2] = new Rectangle(4, 7);
        array[3] = new Ball(5);
        array[4] = new Cube(6);

        for (int i=0;i< array.length;i++){
            if (array[i].getClass() == Line2D.class) {
                System.out.println("Line marked by points [" + ((Line2D)array[i]).getA1() + "," + ((Line2D)array[i]).getA2() + "][" + ((Line2D)array[i]).getB1() + "," + ((Line2D)array[i]).getB2() + "] has lenght " + calculator.lineLength((Line2D)array[i]));
            } else if (array[i].getClass() == Rectangle.class){
                System.out.println("Rectangle with dimensials " + ((Rectangle)array[i]).getWidth() + " i " + ((Rectangle)array[i]).getHeight() + " its area is "+ calculator.shapeArea((GeometricShape)array[i])) ;
            } else if(array[i].getClass() == Circle.class) {
                System.out.println("Circle with its radius " + ((Circle)array[i]).getRadius() + " has shape " + calculator.shapeArea((GeometricShape)array[i]));
            } else if (array[i].getClass() == Ball.class){
                System.out.println("Ball with its radius "+ ((Ball)array[i]).getRadius() + " has volume " + calculator.volume((Shape3D)array[i]));
            } else {
                System.out.println("Cube with its side  " + ((Cube)array[i]).getSide() + " has volume " + calculator.volume(((Shape3D)array[i])));
            }
        }


    }
}
