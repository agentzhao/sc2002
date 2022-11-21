package area;

import java.util.Scanner;

public class Shape3DApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numShapes, choice, totalArea = 0;
    int length, width, height;

    System.out.print("Enter the number of shapes: ");
    numShapes = input.nextInt();

    System.out.println("Enter the shapes: ");
    System.out.println("1. Sphere, 2. Pyramid, 3. Cuboid");

    for (int i = 0; i < numShapes; i++) {
      System.out.println("");
      System.out.print("Enter your choice: ");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter the radius: ");
          int radius = input.nextInt();
          Sphere sphere = new Sphere(radius);
          System.out.println("Surface Area of sphere: " + sphere.getSurfaceArea());
          totalArea += sphere.getSurfaceArea();
          break;
        case 2:
          System.out.print("Enter the base: ");
          int base = input.nextInt();
          System.out.print("Enter the height: ");
          height = input.nextInt();
          System.out.print("Enter the length: ");
          length = input.nextInt();
          Pyramid pyramid = new Pyramid(base, height, length);
          System.out.println("Surface Area of pyramid: " + pyramid.getSurfaceArea());
          totalArea += pyramid.getSurfaceArea();
          break;
        case 3:
          System.out.print("Enter the length: ");
          length = input.nextInt();
          System.out.print("Enter the width: ");
          width = input.nextInt();
          System.out.print("Enter the height: ");
          height = input.nextInt();
          Cuboid cuboid = new Cuboid(length, width, height);
          System.out.println("Surface Area of cuboid: " + cuboid.getSurfaceArea());
          totalArea += cuboid.getSurfaceArea();
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
    System.out.println("Total surface area: " + totalArea);
  }
}
