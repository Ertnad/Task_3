package ru.vsu.sc.tretyakov_d_s;

import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Line;
import ru.vsu.sc.tretyakov_d_s.Figures.Point;
import ru.vsu.sc.tretyakov_d_s.Figures.Rectangle;
import ru.vsu.sc.tretyakov_d_s.Figures.SimpleColor;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Coloring picture = new Coloring (new Line(4, 0.4, 0.6),
            new Line(7, 0, 1),
            new Rectangle(new Point2D.Double(-3,-2), new Point2D.Double(3,2)));

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

    private static void printTest(SimpleColor currentResult, SimpleColor correctResult, String testResult) {
        System.out.printf("Result is %s: %s is %s \n", testResult, currentResult, correctResult);
    }

    private static void testPoints(Coloring picture) {

        Point[] pointsArr = {new Point(-6, -3), new Point(4, 3), new Point(9, 8),
            new Point(-6, -7), new Point(-10, -3), new Point(3, 3),
            new Point(8,3)};

        SimpleColor[] correctResultsArr = {SimpleColor.WHITE, SimpleColor.WHITE, SimpleColor.GREEN, SimpleColor.BLUE,
            SimpleColor.GRAY, SimpleColor.ORANGE, SimpleColor.ORANGE,};

        for (int i = 0; i < pointsArr.length; i++) {
            SimpleColor currentResult = picture.getColor(pointsArr[i].x, pointsArr[i].y);
            SimpleColor correctResult = correctResultsArr[i];

            if (currentResult == correctResult) {
                printTest(currentResult, correctResult, "correct");
            }
            else {
                printTest(currentResult, correctResult, "incorrect");
            }
        }
    }


}
