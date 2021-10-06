package ru.vsu.sc.tretyakov_d_s;


import static ru.vsu.sc.tretyakov_d_s.Test.testPoints;
import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Line;
import ru.vsu.sc.tretyakov_d_s.Figures.Rectangle;
import ru.vsu.sc.tretyakov_d_s.Figures.SimpleColor;

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

    public static void printTest(SimpleColor currentResult,
        SimpleColor correctResult, String testResult) {
        System.out.printf("Test result is %s: %s is %s \n",
            testResult, currentResult, correctResult);
    }
}





