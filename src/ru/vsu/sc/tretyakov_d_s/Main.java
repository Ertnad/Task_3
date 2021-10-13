package ru.vsu.sc.tretyakov_d_s;


import java.awt.geom.Point2D;
import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Rectangle;
import ru.vsu.sc.tretyakov_d_s.Figures.VerticalParabola;

public class Main {

    public static void main(String[] args) {

        Coloring picture = new Coloring(new VerticalParabola(6, -5, 0.125),
            new Rectangle(new Point2D.Double(-5, 0), new Point2D.Double(4, 7)),
            new Rectangle(new Point2D.Double(-4, 1), new Point2D.Double(2, 4)));

        Test.testPoints(picture);

        double x = readPoint("X");
        double y = readPoint("Y");
        printColorForPoint(x, y, picture);

    }

    private static void printColorForPoint(double x, double y, Coloring picture) {
        System.out.printf("(%.2f, %.2f) -> %s", x, y, picture.getColor(x, y));
    }

    private static double readPoint(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the %s point ", name);
        return scanner.nextDouble();
    }

}





