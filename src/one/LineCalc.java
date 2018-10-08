package one;

public class LineCalc {

    double lineLength(Line2D line2D) {
        return Math.pow((Math.pow((line2D.getA1()-line2D.getB1()),2) + Math.pow((line2D.getA2()-line2D.getB2()),2)), 0.5);
    }


}
