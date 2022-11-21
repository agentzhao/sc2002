package tut2;

public class Circle {
  private double radius; // radius of circle
  private static final double PI = 3.14159;
  double area;
  double circumference;

  // constructor
  public Circle(double rad) { // why? Circle(double rad)
    super();
    this.radius = rad;
    this.area = 0;
    this.circumference = 0;
  }

  // mutator method – set radius
  public void setRadius(double rad) {
    this.radius = rad;
  }

  // accessor method – get radius
  public double getRadius() {
    return this.radius;
  }

  // calculate area
  public double area() {
    this.area = Circle.PI * this.radius * this.radius;
    return this.area;
  }

  // calculate circumference
  public double circumference() {
    this.circumference = 2 * Math.PI * this.radius;
    return this.circumference;
  }

  // print area
  public void printArea() {
    System.out.println("Area of circle");
    System.out.println("Radius: " + this.radius);
    System.out.println("Area: " + this.area);
  }

  // print circumference
  public void printCircumference() {
    System.out.println("Circumference of circle");
    System.out.println("Radius: " + this.radius);
    System.out.println("Circumference: " + this.circumference);
  }
}
