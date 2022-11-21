package tut3;

import tut3.Circle;

public class Cylinder {
  protected Point center = new Point();
  protected Circle base = new Circle();
  private int height;

  public Cylinder(Point center, Circle base, int height) {
    this.center = center;
    this.base = base;
    this.height = height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return this.height;
  }

  public String toString() {
    return "Cylinder [center=" + this.center + ", base=" + this.base + ", height=" + this.getHeight() + "]";
  }

  public int area() {
    // area of two circles + cylinder surface area
    return 2 * base.area() + (int) (2 * Math.PI * base.getRadius());
  }

  public int volume() {
    return base.area() * this.height;
  }
}
