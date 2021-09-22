package ru.vsu.sc.tretyakov_d_s.Figures;

public class Coloring {

  private final Line verticalLine1;
  private final Line verticalLine2;
  private final Rectangle rectangle;

  public Coloring(Line verticalLine1, Line verticalLine2,
      Rectangle rectangle) {
    this.verticalLine1 = verticalLine1;
    this.verticalLine2 = verticalLine2;
    this.rectangle = rectangle;
  }

  public SimpleColor getColor(double x, double y) {
    if (rectangle.isPointInsideRectangle(x, y))
      return SimpleColor.ORANGE;

    else if (!verticalLine2.isPointAbove(x, y))
      return SimpleColor.GREEN;

    else if (verticalLine1.isPointAbove(x, y))
      return SimpleColor.YELLOW;

    else return SimpleColor.WHITE;
  }
}
