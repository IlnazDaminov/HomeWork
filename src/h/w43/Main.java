package h.w43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Point a = new Point(sc.nextDouble(), sc.nextDouble());
        Point b = new Point(sc.nextDouble(), sc.nextDouble());
        PointDistanceCalculator distanceCalculator = new PointDistanceCalculator();

        System.out.println(distanceCalculator.calculate(a, b));

    }
}