// - valueOfDice: int
// + Dice()
// + setDiceValue(): void
// + getDiceValue(): int
// + printDiveValue (): void

package tut2;

import java.util.Random;

public class Dice {
  private int valueOfDice;

  public Dice() {
    valueOfDice = 0;
  }

  public void setDiceValue() {
    this.valueOfDice = (int) (Math.random() * (6) + 1);
  }

  public void setDiceValue2() {
    Random r = new Random();
    this.valueOfDice = r.nextInt(6) + 1;
  }

  public int getDiceValue() {
    return this.valueOfDice;
  }

  public void printDiceValue() {
    System.out.println("Current Value is " + this.valueOfDice);
  }
}
