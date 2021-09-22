package ru.vsu.sc.tretyakov_d_s.Figures;

public class Line {
  private final double x0;
  private final double y0;
  private final double a;

  public Line(double x0, double y0, double a) {
    this.x0 = x0;
    this.y0 = y0;
    this.a = a;
  }

  public boolean isPointAbove(double x, double y) {
    return y > a * (x - x0) + y0;
  }
}
