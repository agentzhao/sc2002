package area;

public class Square implements Shape {
  private int side;

  public Square(int side) {
    this.side = side;
  }

  public int getSide() {
    return this.side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  public double getArea() {
    return this.side * this.side;
  };
}
