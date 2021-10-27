package ru.vsu.sc.tretyakov_d_s;

import java.awt.geom.Point2D;
import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Rectangle;
import ru.vsu.sc.tretyakov_d_s.Figures.VerticalParabola;

public class Main {

    private static final VerticalParabola verticalParabola =
        new VerticalParabola(6, -5, 0.125);
    private static final Rectangle largeRectangle =
        new Rectangle(new Point2D.Double(-5, 0), new Point2D.Double(4, 7));
    private static final Rectangle smallRectangle =
        new Rectangle(new Point2D.Double(-4, 1), new Point2D.Double(2, 4));

    public static final Coloring coloring = new Coloring(verticalParabola, largeRectangle, smallRectangle);


    public static void main(String[] args) {

        if (Test.testPoints(coloring)) {
            System.out.println("All tests completed. The program works properly");

            double x = readPoint("X");
            double y = readPoint("Y");


            printColorForPoint(x, y);
        }
    }

    static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s", x, y, coloring.getColor(x, y));
    }

    static double readPoint(String name) {
        System.out.printf("Enter the %s point ", name);
        Scanner scanner = new Scanner(System.in);
        double point = scanner.nextDouble();
        if (point < -10 || point > 10) {
            System.out.printf("Error. The point %s can't be equal to %.2f. ", name, point);
            System.out.print("All points must be between -10 and 10");
            System.exit(1); }
        return point;
    }
}
