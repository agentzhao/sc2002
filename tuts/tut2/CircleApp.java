package tut2;

import java.util.Scanner;

public class CircleApp {
  public static void main(String[] args) {
    Circle app = null;
    boolean repeat = true;
    Scanner sc = new Scanner(System.in);

    System.out.println("==== Circle Computation =====");
    System.out.println("|1. Create a new circle |");
    System.out.println("|2. Print Area |");
    System.out.println("|3. Print circumference |");
    System.out.println("|4. Quit |");
    System.out.println("=============================");

    while (repeat) {
      System.out.print("Choose option (1-3):");
      switch (sc.nextInt()) {
        case 1:
          System.out.println("Enter the radius to compute the area and circumference: ");
          app = new Circle(sc.nextDouble());
          System.out.println("A new circle is created");
          break;

        case 2:
          if (app == null) {
            System.out.println("No circle is created yet");
          } else {
            app.area();
            app.printArea();
          }
          break;

        case 3:
          if (app == null) {
            System.out.println("No circle is created yet");
          } else {
            app.circumference();
            app.printCircumference();
          }
          break;

        case 4:
          System.out.println("Thank you!!");
          repeat = false;
          break;

        default:
          System.out.println("Invalid command, please try again!");
          break;
      }
    }
    sc.close();
  }
}
