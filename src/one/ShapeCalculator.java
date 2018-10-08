package one;

public class ShapeCalculator extends LineCalc implements Cacl2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    @Override
    public double ballVollume(Ball ball) {
        return ball.getRadius() * 3/4 * Math.PI;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getSide() * cube.getSide() * cube.getSide();
    }
}
