package tut3;

import java.util.Scanner;

public class VendingMachine {
  Scanner sc = new Scanner(System.in);

  // constructor
  public VendingMachine() {
    super();
  }

  // get the drink selection, and return the cost of the drink
  private double selectDrink() {
    System.out.println("====== Vending Machine ======");
    System.out.println("|1. Buy Beer ($3.00) |");
    System.out.println("|2. Buy Coke ($1.00) |");
    System.out.println("|3. Buy Green Tea ($5.00) |");
    System.out.println("|============================");
    System.out.println("Please enter selection: ");
    int input = sc.nextInt();
    if (input == 1) {
      return 3.00;
    } else if (input == 2) {
      return 1.00;
    } else if (input == 3) {
      return 5.00;
    } else {
      System.out.println("Invalid selection");
      return 0.00;
    }
  }

  // insert the coins and returns the amount inserted
  private double insertCoins(double drinkCost) {
    System.out.println("Please insert coins: ");
    System.out.println("========== Coins Input ===========");
    System.out.println("|Enter 'Q' for ten cents input |");
    System.out.println("|Enter 'T' for twenty cents input|");
    System.out.println("|Enter 'F' for fifty cents input |");
    System.out.println("|Enter 'N' for a dollar input |");
    System.out.println("==================================");

    double total = 0.0;
    while (total < drinkCost) {
      String input = sc.next();
      if (input.equals("Q")) {
        total += 0.10;
      } else if (input.equals("T")) {
        total += 0.20;
      } else if (input.equals("F")) {
        total += 0.50;
      } else if (input.equals("N")) {
        total += 1.00;
      } else {
        System.out.println("Invalid input");
      }
      System.out.println("Coins inserted: " + total);
    }
    return total;
  }

  // check the change and print the change on screen
  private void checkChange(double amount, double drinkCost) {
    double change = amount - drinkCost;
    System.out.println("Change: $ " + change);
  }

  // print the receipt and collect the drink
  private void printReceipt() {
    System.out.println("Please collect your drink");
    System.out.println("Thank you !!");
  }

  public start(){
    double drinkCost = machine.selectDrink();
    double amount = machine.insertCoins(drinkCost);
    machine.checkChange(amount, drinkCost);
    machine.printReceipt(); 
  }
}
