package Oop.Lab9;

public class LineItem {
    private Product product;
    private int quantity;
    private int lineItemId;
    private static int count;

    LineItem(Product product, int quantity) {
        count++;
        this.quantity = quantity;
        this.product = product;
        this.lineItemId = count;
    }

    public int getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(int lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalAmount() {
        return quantity * (product.getPrice());
    }

    public void printDetail() {
        System.out.println("LineItem ID: " + lineItemId + " " + "Product: " + product.getProductName() + " "
                + "Quantity: " + quantity + " " + "TotalAmount: " + calculateTotalAmount());
    }

}
