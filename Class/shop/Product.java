package Oop.Lab9;

public class Product {
    private String productName;
    private int productId;
    private double price;

    Product(String ProductName, int productId, double price) {
        this.productName = ProductName;
        this.productId = productId;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
