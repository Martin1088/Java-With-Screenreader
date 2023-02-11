
public class Rechteck {
  // attributte
  int x;
  int y;
  int witdh;
  int hight;

  // Metoden
  public int calcutateArea() {
    return witdh * hight;
  }
  public int calculatePerimeter() {
    return (witdh * 2) + (hight * 2);
  }
  public Rechteck(int x, int y, int witdh, int hight) {
this.x = x;
this.y = y;
this.witdh = witdh;
this.hight = hight;
  }

}
