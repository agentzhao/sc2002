package area;

public class Pyramid extends Triangle implements _3d {
  private int length;

  public Pyramid(int base, int height, int length) {
    super(base, height);
    this.length = length;
  }

  public double getVolume() {
    return getArea() * length / 3;
  }

  public double getSurfaceArea() {
    return getArea() * 4 + getBase() * length;
  }
}
