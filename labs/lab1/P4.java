package lab1;

import java.util.Scanner;

public class P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height: ");
    int height = sc.nextInt();
    sc.close();

    for (int i = 1; i <= height; i++) {
      int temp = i;
      while (temp > 0) {
        if (temp % 2 == 0) {
          System.out.print("BB");
        } else {
          System.out.print("AA");
        }
        temp -= 1;
      }
      System.out.print("\n");
    }

    System.exit(0);
  }
}
