import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Price: " + price + ", Quantity: " + quantity;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}

public class FishShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Добавяне на продукти в кошницата
        Product fish1 = new Product("Salmon", "Fresh salmon fillet", 9.99, 5);
        Product fish2 = new Product("Tuna", "Yellowfin tuna steak", 7.99, 10);
        cart.addProduct(fish1);
        cart.addProduct(fish2);

        // Извеждане на продуктите в кошницата
        System.out.println("Products in the shopping cart:");
        cart.displayProducts();

        // Изчисляване на общата цена
        double total = cart.calculateTotal();
        System.out.println("Total price: $" + total);

        // Промяна на наличността на продукт
        System.out.println("Enter the name of the product to update quantity:");
        String productName = scanner.nextLine();
        for (Product product : cart.getProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                System.out.println("Enter the new quantity:");
                int newQuantity = scanner.nextInt();
                product.setQuantity(newQuantity);
                break;
            }
        }

        // Изтриване на продукт от кошницата
        System.out.println("Enter the name of the product to remove:");
        scanner.nextLine(); // Изчистване на буфера от нов ред
        String productToRemove = scanner.nextLine();
        for (Product product : cart.getProducts());
    }
}
