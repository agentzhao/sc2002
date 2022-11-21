package lab3;

import java.util.Scanner;

public class PlaneApp {
  public static void main(String[] args) {
    Plane app = new Plane();
    boolean repeat = true;
    Scanner sc = new Scanner(System.in);
    int input1, input2;

    System.out.println("(1) Show number of empty seats");
    System.out.println("(2) Show the list of empty seats");
    System.out.println("(3) Show the list of seat assignments by seat ID");
    System.out.println("(4) Show the list of seat assignments by customer ID");
    System.out.println("(5) Assign a customer to a seat");
    System.out.println("(6) Remove a seat assignment");
    System.out.println("(7) Exit");

    while (repeat) {
      System.out.print("Enter the number of your choice: ");
      switch (sc.nextInt()) {

        case 1:
          app.showNumEmptySeats();
          break;

        case 2:
          app.showEmptySeats();
          break;

        case 3:
          app.showAssignedSeat(true);
          break;

        case 4:
          app.showAssignedSeat(false);
          break;

        case 5:
          System.out.println("Assigning Seat ...");
          System.out.print("Please enter SeatID: ");
          input1 = sc.nextInt();
          System.out.print("Please enter Customer ID:");
          input2 = sc.nextInt();
          app.assignSeat(input1, input2);
          break;

        case 6:
          System.out.print("Enter SeatID to unassign customer from: ");
          input1 = sc.nextInt();
          app.unAssignSeat(input1);
          break;

        case 7:
          repeat = false;
          break;

        default:
          System.out.println("Invalid command, please try again!");

      }
    }
    sc.close();
  }

}
