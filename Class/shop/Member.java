package Oop.Lab9;

public class Member extends Customer {
    private double points;

    Member(String firstname, String lastName, int customerld) {
        super(firstname, lastName, customerld);
        points = 0;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double shoppingAmount) {
        points = points + (shoppingAmount / 1000);
    }

    public double convertPoints(double p) {
        double converted = p * 20;
        points = points - p;
        return converted;
    }
}
