package h.w43;

public class PointDistanceCalculator {

    public double calculate(Point a, Point b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(),2));
    }
}
