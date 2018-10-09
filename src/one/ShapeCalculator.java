package one;

public class ShapeCalculator extends LineCalc implements Cacl2D, Calc3D {
//    @Override
//    public double circleArea(Circle circle) {
//        return Math.PI * Math.pow(circle.getRadius(), 2);
//    }
//
//    @Override
//    public double rectangleArea(Rectangle rectangle) {
//        return rectangle.getHeight() * rectangle.getWidth();
//    }
//
//    @Override
//    public double ballVollume(Ball ball) {
//        return ball.getRadius() * 3/4 * Math.PI;
//    }
//
//    @Override
//    public double cubeVolume(Cube cube) {
//        return cube.getSide() * cube.getSide() * cube.getSide();
//    }


    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape.getClass() == Rectangle.class) {
            return ((Rectangle)shape).getHeight() * ((Rectangle)shape).getWidth();
        } else {
            return Math.pow(((Circle)shape).getRadius(), 2) * Math.PI;
        }
    }

    @Override
    public double volume(Shape3D shape3D) {
        if (shape3D.getClass() == Ball.class) {
            return Math.PI * 3/4 * Math.pow(((Ball)shape3D).getRadius(), 3);
        } else {
            return Math.pow(((Cube)shape3D).getSide(), 3);
        }
    }

}
