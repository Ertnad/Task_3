package ru.vsu.sc.tretyakov_d_s;

import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Line;
import ru.vsu.sc.tretyakov_d_s.Figures.Rectangle;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Coloring picture = new Coloring(new Line(4, 0.4, 0.6),
            new Line(7, 0, 1),
            new Rectangle(new Point2D.Double(-3, -2), new Point2D.Double(3, 2)));

        testPoints(picture);

        double x = readPoint("X");
        double y = readPoint("Y");
        printColorForPoint(x, y, picture);

    }

    private static void printColorForPoint(double x, double y, Coloring picture) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, picture.getColor(x, y));
    }

    private static double readPoint(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the %s point ", name);
        return scanner.nextDouble();
    }

    private static void testPoints(Coloring picture) {
        System.out.println("Checking the correct coloring of the zones in pre-selected points");
        System.out.printf("(1.00, 1.00) -> ORANGE is %s%n", picture.getColor(1, 1));
        System.out.printf("(2.00, -1.00) -> ORANGE is %s%n", picture.getColor(2, -1));
        System.out.printf("(1.00, 3.00) -> YELLOW is %s%n", picture.getColor(1, 3));
        System.out.printf("(-3.00, -3.00) -> YELLOW is %s%n", picture.getColor(-3, -3));
        System.out.printf("(8.00, 0.00) -> GREEN is %s%n", picture.getColor(8, 0));
        System.out.printf("(3.00, -3.00) -> WHITE is %s%n", picture.getColor(3, -3));
        System.out.println("Checking the correct coloring of the zone at an arbitrary point ");
    }


}





