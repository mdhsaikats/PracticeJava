package Product_Test;

public class Product {
    public String productName;
    public int price;
    public int stockQuantity;

    public Product(String productName, int price, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void purchaseProduct(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            int totalPrice = quantity * price;
            System.out.println("Total Price: " + totalPrice);
        } else {
            System.out.println("Insufficient Stock");
        }
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Stock Quantity: " + stockQuantity);
    }
}
