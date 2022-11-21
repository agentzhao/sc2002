// Press <key> to roll the first dice
// 1
// Current Value is 3
// Press <key> to roll second dice
// 2
// Current Value is 3
// Your total number is: 6

package tut2;

import java.util.Scanner;

public class DiceApp {
  public static void main(String[] args) {
    Dice app = new Dice();
    Scanner sc = new Scanner(System.in);

    int total = 0;
    System.out.print("Press <key> to roll the first dice: ");
    sc.nextLine();
    app.setDiceValue2();
    total += app.getDiceValue();
    app.printDiceValue();

    System.out.print("Press <key> to roll the second dice: ");
    sc.nextLine();
    app.setDiceValue();
    total += app.getDiceValue();
    app.printDiceValue();

    System.out.println("Your total number is: " + total);
    sc.close();
  }
}
