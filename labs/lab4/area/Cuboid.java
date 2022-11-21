package area;

public class Cuboid extends Rectangle implements _3d {
  private int height;

  public Cuboid(int length, int width, int height) {
    super(length, width);
    this.height = height;
  }

  public double getVolume() {
    return super.getLength() * super.getWidth() * this.height;
  }

  public double getSurfaceArea() {
    // 2(ab+ac+bc)
    int l = super.getLength();
    int w = super.getWidth();
    int h = this.height;
    return 2 * (l * w + l * h + w * h);
  }
}
