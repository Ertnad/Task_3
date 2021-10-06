package ru.vsu.sc.tretyakov_d_s;

import static ru.vsu.sc.tretyakov_d_s.Main.printTest;
import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.Point;
import ru.vsu.sc.tretyakov_d_s.Figures.SimpleColor;

class Test {

  public static void testPoints(Coloring picture) {

    Point[] pointsArr = {new Point(1, 1), new Point(2, -1), new Point(-1, 3),
        new Point(-3, -3), new Point(8, 0), new Point(3, -3)};

    SimpleColor[] correctResultsArr = {SimpleColor.ORANGE, SimpleColor.ORANGE,
        SimpleColor.YELLOW, SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.WHITE};

    System.out.println("Checking predefined points");

    for (int i = 0; i < pointsArr.length; i++) {
      SimpleColor currentResult = picture.getColor(pointsArr[i].x, pointsArr[i].y);
      SimpleColor correctResult = correctResultsArr[i];

      if (currentResult == correctResult) {
        printTest(currentResult, correctResult, "correct");
      } else {
        printTest(currentResult, correctResult, "incorrect");
        System.out.println("Error. The last result is incorrect");
        System.exit(1);
      }
    }
    System.out.println("All test is correct. Now check the random point");
  }
}

