package area;

public class Circle implements Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * this.radius * this.radius;
  };
}
