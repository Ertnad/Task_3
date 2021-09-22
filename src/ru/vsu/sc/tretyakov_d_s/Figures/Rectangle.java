package ru.vsu.sc.tretyakov_d_s.Figures;

import java.awt.geom.Point2D;

public class Rectangle {
  public Point2D.Double leftlowerpoint;
  public Point2D.Double rightupperpoint;

  public Rectangle(Point2D.Double llp, Point2D.Double rup) {
    this.leftlowerpoint = llp;
    this.rightupperpoint = rup;
  }

  public boolean isPointInsideRectangle(double x, double y) {
    return (x > leftlowerpoint.getX() && x < rightupperpoint.getX())
        && (y > leftlowerpoint.getY() && y < rightupperpoint.getY());
  }
}