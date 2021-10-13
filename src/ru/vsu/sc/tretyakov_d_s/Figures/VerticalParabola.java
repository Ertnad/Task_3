package ru.vsu.sc.tretyakov_d_s.Figures;

public class VerticalParabola {

  private final double x0;
  private final double y0;
  private final double a;

  public VerticalParabola(double x0, double y0, double a) {
    this.x0 = x0;
    this.y0 = y0;
    this.a = a;
  }

  public boolean isPointAbove(double x, double y) {
    return y > a * Math.pow(x - x0, 2) + y0;
  }

}