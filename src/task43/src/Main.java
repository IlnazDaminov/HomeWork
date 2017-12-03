package task43.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exit");;
            System.exit(0);
        }
        String coordinate = scanner.nextLine();
        String[] cds = coordinate.split(",");

        Point a = new Point(Double.valueOf(cds[0]), Double.valueOf(cds[1]));
        Point b = new Point(Double.valueOf(cds[2]),Double.valueOf(cds[3]));
        PointDistanceCalculator distanceCalculator = new PointDistanceCalculator();

        System.out.println(distanceCalculator.calculate(a,b));
    }
}
