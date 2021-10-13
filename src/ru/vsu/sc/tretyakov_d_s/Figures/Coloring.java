package ru.vsu.sc.tretyakov_d_s.Figures;

public class Coloring {

  private final VerticalParabola verticaParabola;
  private final Rectangle largeRectangle;
  private final Rectangle smallRectangle;

  public Coloring(VerticalParabola verticaParabola, Rectangle largeRectangle,
      Rectangle smallRectangle) {
    this.verticaParabola = verticaParabola;
    this.largeRectangle = largeRectangle;
    this.smallRectangle = smallRectangle;
  }

  public SimpleColor getColor(double x, double y) {
    if (verticaParabola.isPointAbove(x, y) && !smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.GREEN;

    else if (largeRectangle.isPointInsideRectangle(x, y) && !verticaParabola.isPointAbove(x, y) && !smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.ORANGE;

    else if (!verticaParabola.isPointAbove(x, y) && smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.YELLOW;

    else return SimpleColor.GREY;
  }
}
