import java.util.Scanner;

// create array after user enter the size
// set flag to stop sorting in bubblesort

class bubblesort {
  public static void bubble(int a[], int n) {
    int i, j, t;
    for (i = n - 2; i >= 0; i--) {
      for (j = 0; j <= i; j++) {
        if (a[j] > a[j + 1]) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }
  }

  static void printArray(int a[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[] a = new int[100];
    int n, i;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of Interger elements to be sorted: ");
    n = sc.nextInt();

    for (i = 0; i < n; i++) {
      System.out.printf("Enter integer value for element no " + (i + 1) + ": ");
      a[i] = sc.nextInt();
    }

    sc.close();

    // bubblesort ob = new bubblesort();

    bubble(a, n);

    System.out.println("\nFinally sorted array is: ");
    printArray(a, n);
  }
}
