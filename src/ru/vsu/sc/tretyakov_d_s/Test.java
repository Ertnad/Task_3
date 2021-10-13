package ru.vsu.sc.tretyakov_d_s;

import static ru.vsu.sc.tretyakov_d_s.Main.printTest;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Point;
import ru.vsu.sc.tretyakov_d_s.Figures.SimpleColor;

class Test {

  public static void testPoints(Coloring picture) {

    Point[] pointsArr = {new Point(0, 5), new Point(-4, 5), new Point(1, 3),
        new Point(3, -3), new Point(-3, 2)};

    SimpleColor[] correctResultsArr = {SimpleColor.GREEN, SimpleColor.ORANGE,
        SimpleColor.GREY, SimpleColor.GREEN, SimpleColor.YELLOW};

    System.out.println("Checking predefined points");

    for (int i = 0; i < pointsArr.length; i++) {
      SimpleColor testResult = picture.getColor(pointsArr[i].x, pointsArr[i].y);
      SimpleColor correctResult = correctResultsArr[i];

      if (testResult == correctResult) {
        printTest(testResult, correctResult, "correct");
      } else {
        printTest(testResult, correctResult, "incorrect");
        System.out.println("Error. The last result is incorrect");
        System.exit(1);
      }
    }
    System.out.println("All test is correct. Now check the random point");
  }
}

