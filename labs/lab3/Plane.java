package lab3;

import java.util.Arrays;

public class Plane {
  private PlaneSeat[] seat = new PlaneSeat[12];
  // private PlaneSeat[] dupSeat = new PlaneSeat[12];
  private int numEmptySeat;

  public Plane() {
    this.numEmptySeat = 12;
    for (int i = 0; i < 12; i++) {
      this.seat[i] = new PlaneSeat(i);
    }
  }

  private int[] sortSeats() {
    if (this.numEmptySeat == 0) {
      return new int[0];
    }

    int[] temp = new int[12 - this.numEmptySeat];
    int counter = 0;
    for (int i = 0; i < 12; i++) {
      if (this.seat[i].isOccupied()) {
        temp[counter] = this.seat[i].getCustomerID();
        counter++;
      }
    }

    Arrays.sort(temp); // customerID sorted in ascending order
    // for (int i = 0; i < temp.length; i++) {
    // if (i < temp.length) {
    // this.seat[i].assign(temp[i]);
    // } else {
    // this.seat[i].unAssign();
    // }
    // }
    return temp;
  }

  public void showNumEmptySeats() {
    System.out.println("There are " + this.numEmptySeat + " empty seats");
  }

  public void showEmptySeats() {
    System.out.println("The following seats are empty:");
    for (int i = 0; i < this.seat.length; i++) {
      if (this.seat[i].isOccupied() == false) {
        System.out.println("SeatID " + (i + 1));
      }
    }
  }

  public void showAssignedSeat(boolean bySeatId) {
    System.out.println("The seat assignments are as follows:");
    if (bySeatId) {
      for (int i = 0; i < this.seat.length; i++) {
        if (this.seat[i].isOccupied()) {
          System.out.println("SeatID " + (i + 1) + " assigned to CustomerID " + this.seat[i].getCustomerID() + ".");
        }
      }
    } else {
      // PlaneSeat[] seatTemp = sortSeats();
      int[] temp = sortSeats();
      for (int j = 0; j < temp.length; j++) {
        for (int i = 0; i < this.seat.length; i++) {
          if (this.seat[i].getCustomerID() == temp[j]) {
            System.out.println("SeatID " + (i + 1) + " assigned to CustomerID " + this.seat[i].getCustomerID() + ".");
          }
        }
      }
    }
  }

  public void assignSeat(int seatId, int id) {
    if (this.seat[seatId - 1].isOccupied()) {
      System.out.println("Seat already assigned to a customer.");
    } else {
      this.seat[seatId - 1].assign(id);
      this.numEmptySeat--;
      System.out.println("Seat Assigned!");
    }
  }

  public void unAssignSeat(int seatId) {
    this.seat[seatId - 1].unAssign();
    this.numEmptySeat++;
    System.out.println("Seat Unassigned!");
  }

}
