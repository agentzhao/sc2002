package tut3;

import tut3.Point;

public class Circle {
  protected Point center = new Point();
  private int radius;

  public Circle(int radius, int a, int b) {
    centre = new Point(a, b);
    this.radius = radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public String toString() {
    return "Circle [center=" + centre.getX() + ", " + centre.getY() + ", radius=" + getRadius() + "]";
  }

  public int area() {
    return (int) (radius * radius * Math.PI);
  }
}
