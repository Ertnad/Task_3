package ru.vsu.sc.tretyakov_d_s.Figures;

import java.awt.geom.Point2D;

public class Coloring {

  public final VerticalParabola verticaParabola = new VerticalParabola(6,-5,0.125);
  public final Rectangle largeRectangle =
      new Rectangle(new Point2D.Double(-5, 0), new Point2D.Double(4, 7));
  public final Rectangle smallRectangle =
      new Rectangle(new Point2D.Double(-4, 1), new Point2D.Double(2, 4));


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
