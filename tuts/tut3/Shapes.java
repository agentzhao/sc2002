package tut3;

import tut3.Circle;
import tut3.Cylinder;

public class Shapes {
  public static void main(String[] args) {
    Point center = new Point(2, 4);
    Circle base = new Circle(center, 5);
    Cylinder cylinder = new Cylinder(center, base, 10);

    // System.out.println(base);
    System.out.println(cylinder);
    System.out.println("Area: " + cylinder.area());
    System.out.println("Volume: " + cylinder.volume());
  }
}
