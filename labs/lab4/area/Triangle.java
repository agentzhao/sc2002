package area;

public class Triangle implements Shape {
  private int base;
  private int height;

  public Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  public int getBase() {
    return this.base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getArea() {
    return this.base * this.height / 2;
  };
}
