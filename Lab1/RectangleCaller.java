package Oop.Lab1;
public class RectangleCaller {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.setWidthHeigth(5, 10);
    System.out.println(r1.getPerimeter());
    System.out.println(r1.getArea());
    r1.printInfo();

    Rectangle r2 = new Rectangle();
    r2.setWidthHeigth(2.5, 1.5);
    System.out.println(r2.getPerimeter());
    System.out.println(r2.getArea());
    r2.printInfo();

    Rectangle r3 = new Rectangle();
    r3.setWidthHeigth(25, 5);
    System.out.println(r3.getPerimeter());
    System.out.println(r3.getArea());
    r3.printInfo();

  }
}
