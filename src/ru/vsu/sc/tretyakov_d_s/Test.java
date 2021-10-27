package ru.vsu.sc.tretyakov_d_s;

import ru.vsu.sc.tretyakov_d_s.Figures.Coloring;
import ru.vsu.sc.tretyakov_d_s.Figures.SimpleColor;


public class Test {


  static  boolean testPoints(Coloring coloring) {
    if (coloring.getColor(0, 5) != SimpleColor.GREEN) {
      System.out.println("Test 1 is incorrect");
      return false;
    } else if (coloring.getColor(-4, 5) != SimpleColor.ORANGE) {
      System.out.println("Test 2 is incorrect");
      return false;
    } else if (coloring.getColor(1, 3) != SimpleColor.GREY) {
      System.out.println("Test 3 is incorrect");
      return false;
    } else if (coloring.getColor(3, -3) != SimpleColor.GREEN) {
      System.out.println("Test 4 is incorrect");
      return false;
    } else if (coloring.getColor(-3, 2) != SimpleColor.YELLOW) {
      System.out.println("Test 5 is incorrect");
      return false;
    } else {
      return true;
    }
  }
}


