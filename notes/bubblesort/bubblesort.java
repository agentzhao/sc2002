import java.util.Scanner;

public class bubblesort {
  public static void main(String[] args) {
    int i, n;
    int[] number = new int[10]; // array to be sorted
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of items: ");
    n = sc.nextInt();
    System.out.print("Enter the list of numbers: ");
    for (i = 0; i < n; i++)
      number[i] = sc.nextInt();
    bubbleSort(number, n);
    System.out.print("The sorted array is: ");
    for (i = 0; i < n; i++)
      System.out.println(number[i] + " ");
  }

  public static void bubbleSort(int[] x, int n) {
    int tempValue, pass, index;
    for (pass = 0; pass < n - 1; pass++) { // n-1 passes
      for (index = 0; index < n - 1 - pass; index++) { // for each pass
        if (x[index] > x[index + 1]) { // comparison
          tempValue = x[index]; // swap process
          x[index] = x[index + 1];
          x[index + 1] = tempValue;
        }
      }
    }
  }
}
