package ru.vsu.sc.tretyakov_d_s.Figures;

public class Coloring {

  private final VerticalParabola verticalParabola;
  private final Rectangle largeRectangle;
  private final Rectangle smallRectangle;

  public Coloring (VerticalParabola verticalParabola, Rectangle largeRectangle, Rectangle smallRectangle){
    this.verticalParabola = verticalParabola;
    this.largeRectangle = largeRectangle;
    this.smallRectangle = smallRectangle;
  }


  public SimpleColor getColor(double x, double y) {

    if (verticalParabola.isPointAbove(x, y) && !smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.GREEN;

    else if (largeRectangle.isPointInsideRectangle(x, y) && !verticalParabola.isPointAbove(x, y) && !smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.ORANGE;

    else if (!verticalParabola.isPointAbove(x, y) && smallRectangle.isPointInsideRectangle(x, y))
      return SimpleColor.YELLOW;

    else return SimpleColor.GREY;
  }
}
