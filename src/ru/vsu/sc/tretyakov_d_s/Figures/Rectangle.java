package ru.vsu.sc.tretyakov_d_s.Figures;

import java.awt.geom.Point2D;

public class Rectangle {
  public Point2D.Double leftLowerPoint;
  public Point2D.Double rightUpperPoint;

  public Rectangle(Point2D.Double llp, Point2D.Double rup) {
    this.leftLowerPoint = llp;
    this.rightUpperPoint = rup;
  }

  public boolean isPointInsideRectangle(double x, double y) {
    return (x > leftLowerPoint.getX() && x < rightUpperPoint.getX())
        && (y > leftLowerPoint.getY() && y < rightUpperPoint.getY());
  }
}