package Oop.Lab1;
public class Rectangle {
    double width;
    double heigth;
    public void setWidthHeigth(double w, double h){
        width = w;
        heigth = h;
    }
    public double getPerimeter(){
        return 2*(width+heigth);
    }
    public double getArea(){
        return width* heigth;
    }
    public void printInfo(){
        System.out.println("height: " +heigth);
        System.out.println("width: " +width);
        System.out.println("perimeter: " +getPerimeter());
        System.out.println("area: "+getArea());
    }
}
