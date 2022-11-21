package area;

import java.util.Scanner;

public class Shape2DApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numShapes, choice, totalArea = 0;

    System.out.print("How many shapes do you want to create? ");
    numShapes = sc.nextInt();

    System.out.println("What kind of shapes do you want to create?");
    System.out.println("1. Triangle, 2. Rectangle, 3. Square, 4. Circle");
    for (int i = 0; i < numShapes; i++) {
      System.out.println("");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter the base of the triangle: ");
          int base = sc.nextInt();
          System.out.print("Enter the height of the triangle: ");
          int height = sc.nextInt();
          Triangle triangle = new Triangle(base, height);
          System.out.print("The area of the triangle is: " + triangle.getArea());
          totalArea += triangle.getArea();
          break;

        case 2:
          System.out.println("Enter the length of the rectangle: ");
          int length = sc.nextInt();
          System.out.println("Enter the width of the rectangle: ");
          int width = sc.nextInt();
          Rectangle rectangle = new Rectangle(length, width);
          System.out.println("The area of the rectangle is: " + rectangle.getArea());
          totalArea += rectangle.getArea();
          break;

        case 3:
          System.out.println("Enter the side of the square: ");
          int side = sc.nextInt();
          Square square = new Square(side);
          System.out.println("The area of the square is: " + square.getArea());
          totalArea += square.getArea();
          break;

        case 4:
          System.out.println("Enter the radius of the circle: ");
          int radius = sc.nextInt();
          Circle circle = new Circle(radius);
          System.out.println("The area of the circle is: " + circle.getArea());
          totalArea += circle.getArea();
          break;

        default:
          System.out.println("Invalid choice!");
          break;
      }
    }
    System.out.println("The total area of all shapes is: " + totalArea);
  }
}
