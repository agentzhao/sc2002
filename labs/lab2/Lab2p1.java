package lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
  public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Perform the following methods:");
      System.out.println("1: multiplication test");
      System.out.println("2: quotient using division by subtraction");
      System.out.println("3: remainder using division by subtraction");
      System.out.println("4: count the number of digits");
      System.out.println("5: position of a digit");
      System.out.println("6: extract all odd digits");
      System.out.println("7: quit");
      choice = sc.nextInt();
      switch (choice) {
        case 1: /* add mulTest() call */
          mulTest();
          break;
        case 2: /* add divide() call */
          System.out.print("m: ");
          int m = sc.nextInt();
          System.out.print("n: ");
          int n = sc.nextInt();
          System.out.println(m + " % " + n + " = " + divide(m, n));
          break;
        case 3: /* add modulus() call */
          System.out.print("m: ");
          m = sc.nextInt();
          System.out.print("n: ");
          n = sc.nextInt();
          System.out.println(m + " % " + n + " = " + modulus(m, n));
          break;
        case 4: /* add countDigits() call */
          System.out.print("Enter digits: ");
          n = sc.nextInt();
          if (n < 0) {
            System.out.println("Enter a positive number");
          } else {
            System.out.println(countDigits(n));
          }
          break;
        case 5: /* add position() call */
          System.out.print("Enter number: ");
          n = sc.nextInt();
          System.out.print("Enter digit: ");
          int digit = sc.nextInt();
          System.out.println("Position = " + position(n, digit));
          break;
        case 6: /* add extractOddDigits() call */
          System.out.print("n: ");
          long num = sc.nextLong();
          if (num < 0) {
            System.out.println("oddDigits = Error input!!");
          } else {
            System.out.println("oddDigits = " + extractOddDigits(num));
          }
          break;
        case 7:
          System.out.println("Program terminating ....");
      }
    } while (choice < 7);
    sc.close();
  }

  public static void mulTest() {
    int correct = 0;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      Random random = new Random();
      int temp1 = random.nextInt(10);
      int temp2 = random.nextInt(10);
      System.out.print("How much is " + temp1 + " and " + temp2 + ": ");
      if (sc.nextInt() == temp1 * temp2) {
        // System.out.println("Correct"); // testing
        correct += 1;
      }
    }
    // sc.close();
    System.out.println(correct + " answers out of 5 are correct");
  }

  public static int divide(int m, int n) {
    int result = 0;
    while (m >= n) {
      m -= n;
      result += 1;
    }
    return result;
  }

  public static int modulus(int m, int n) {
    while (m >= n) {
      m -= n;
    }
    return m;
  }

  public static int countDigits(int n) {
    int count = 0;
    while (n > 0) {
      n /= 10;
      count += 1;
    }
    return count;
  }

  public static int position(int n, int digit) {
    int count = 1;
    while (n > 0) {
      if (n % 10 == digit) {
        return count;
      }
      n /= 10;
      count += 1;
    }
    return -1;
  }

  public static long extractOddDigits(long n) {
    long oddDigits = 0;
    int contains = 0;
    while (n > 0) {
      if (n % 10 % 2 == 1) {
        contains = 1;
        oddDigits = oddDigits * 10 + n % 10;
      }
      n /= 10;
    }
    if (contains == 0) {
      return -1;
    } else {
      long reverse = 0;
      while (oddDigits > 0) {
        reverse = reverse * 10 + oddDigits % 10;
        oddDigits /= 10;
      }
      return reverse;
    }
  }
}
