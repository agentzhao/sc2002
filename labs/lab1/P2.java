package lab1;

import java.util.Scanner;

public class P2 {
  private static Object grade;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int salary, merit;
    System.out.println("Enter your salary: ");
    salary = sc.nextInt();
    System.out.println("Enter your merit: ");
    merit = sc.nextInt();

    if (500 <= salary && salary <= 649){
      if (salary >= 600 && merit >= 10){
        grade = "B";
      } else {
        grade = "C";
      }
    } else if (600 <= salary && salary <= 799){
      if (salary >= 700 && merit >= 20){
        grade = "A";
      } else {
        grade = "B";
      }
    } else if (700 <= salary && salary <= 899){
      grade = "A";
    }

    System.out.println("The grade is " + grade);

    System.exit(0);
  }
}
