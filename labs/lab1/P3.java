package lab1;

import java.util.Scanner;

public class P3 {
  public static void main(String[] args) {
    // constant for USDSGD exhange rate
    final double USDSGD = 1.82;

    int starting, ending, increment;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting value: ");
    starting = sc.nextInt();
    System.out.print("Enter ending value: ");
    ending = sc.nextInt();
    System.out.print("Enter increment value: ");
    increment = sc.nextInt();

    // Error handling
    if (starting > ending) {
      System.out.println("Ending value must be greater than starting value");
          System.exit(0);
    }
    if (increment <= 0) {
      System.out.println("Increment value must be greater than 0");
          System.exit(0);
    }

    // for loop
    System.out.println("US$           S$");
    System.out.println("-------------------");
    for (int i = starting; i <= ending; i += increment) {
      System.out.println(i + "     " + (i * USDSGD));
    }

    // while loop
    int i = starting;
    System.out.println("US$           S$");
    System.out.println("-------------------");
    while (i <= ending) {
      System.out.println(i + "     " + (i * USDSGD));
      i += increment;
    }

    // do while loop
    i = starting;
    System.out.println("US$           S$");
    System.out.println("-------------------");
    do {
      System.out.println(i + "     " + (i * USDSGD));
      i += increment;
    } while (i <= ending);

    System.exit(0);
  }

}
