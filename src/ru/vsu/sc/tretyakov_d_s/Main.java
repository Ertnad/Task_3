package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;

public class Main {

    private static final Coloring picture = new Coloring();
    private static final Test test = new Test();

    public static void main(String[] args) {

        resultTest();

        double x = readPoint("X");
        double y = readPoint("Y");

        printColorForPoint(x, y);

    }

    private static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s", x, y, picture.getColor(x, y));
    }

    private static double readPoint(String name) {
        System.out.printf("Enter the %s point ", name);
        Scanner scanner = new Scanner(System.in);
        double point = scanner.nextDouble();
        if (point < 0 || point > 10) {
            System.out.printf("Error. The point %s can't be equal to %.2f. ", name, point);
            System.out.print("All points must be between 0 and 10");
            System.exit(1); }
        return point;
    }

    private static void resultTest() {
        System.out.println("===================================================================");
        System.out.println("Starting testing the program for errors.");
        if (!test.testPoints()) {
            System.out.println("An error in the test was detected.");
            System.exit(1);}
        else {
            System.out.println("All tests completed. The program works properly"); }
        System.out.println("===================================================================");
    }
}