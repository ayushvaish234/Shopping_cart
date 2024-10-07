import java.util.*;

class Product {
    String name;
    int qty;
    double price;

    Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String toString() {
        return "Product: " + name + " | Price: ₹" + price;
    }

    public String cartPrint() {
        return "Product: " + name + " | Quantity: " + qty + " | Price: ₹" + price;
    }
}

class Shop {
    List<Product> products = new ArrayList<>();
    List<Product> cart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Shop() {
        products.add(new Product("Laptop", 0, 80000));
        products.add(new Product("Smartphone", 0, 20000));
        products.add(new Product("Keyboard", 0, 1500));
        products.add(new Product("Mouse", 0, 800));
    }

    // Display available products
    public void showProducts() {
        System.out.println("\n\nAVAILABLE PRODUCTS:");
        int i = 1;
        for (Product p : products) {
            System.out.println(i + ". " + p);
            i++;
        }
        System.out.println("\n1. Add to cart\n2. Checkout\n3. Back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addToCart();
                break;
            case 2:
                checkout();
                break;
            case 3:
                return;
        }
    }

    // Display the cart
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\n\nYOUR CART:");
        int i = 1, totalAmount = 0;
        for (Product p : cart) {
            System.out.println(i + ". " + p.cartPrint());
            totalAmount += p.qty * p.price;
            i++;
        }

        System.out.println("\nTotal: ₹" + totalAmount);
        System.out.println("\n1. Continue Shopping\n2. Checkout\n3. Remove Item\n4. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return;
            case 2:
                checkout();
                break;
            case 3:
                removeFromCart();
                break;
            case 4:
                System.exit(0);
        }
    }

    // Add product to the cart
    public void addToCart() {
        System.out.println("\n\nEnter product number to add to cart:");
        int i = 1;
        for (Product p : products) {
            System.out.println(i + ". " + p);
            i++;
        }
        int choice = sc.nextInt();

        if (choice > 0 && choice <= products.size()) {
            Product selectedProduct = products.get(choice - 1);
            boolean foundInCart = false;

            for (Product p : cart) {
                if (p.name.equals(selectedProduct.name)) {
                    p.qty++;
                    foundInCart = true;
                    break;
                }
            }

            if (!foundInCart) {
                cart.add(new Product(selectedProduct.name, 1, selectedProduct.price));
            }

            System.out.println("Added " + selectedProduct.name + " to your cart.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Remove product from the cart
    public void removeFromCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\n\nSelect a product to remove:");
        int i = 1;
        for (Product p : cart) {
            System.out.println(i + ". " + p.cartPrint());
            i++;
        }
        int choice = sc.nextInt();

        if (choice > 0 && choice <= cart.size()) {
            Product selectedProduct = cart.get(choice - 1);
            selectedProduct.qty--;

            if (selectedProduct.qty == 0) {
                cart.remove(choice - 1);
                System.out.println(selectedProduct.name + " has been removed from your cart.");
            } else {
                System.out.println("Reduced quantity of " + selectedProduct.name);
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Checkout and display total
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        int totalAmount = 0;
        System.out.println("\n\nCHECKOUT:");
        for (Product p : cart) {
            System.out.println(p.cartPrint());
            totalAmount += p.qty * p.price;
        }

        System.out.println("\nTotal Amount: ₹" + totalAmount);
        System.out.println("\nThank you for shopping with us!");
        System.exit(0);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("\n\nWELCOME TO E-COMMERCE SHOPPING!");
            System.out.print("1. View Products\n" +
                             "2. View Cart\n" +
                             "3. Checkout\n" +
                             "4. Exit\n" +
                             "Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    shop.showProducts();
                    break;
                case 2:
                    shop.viewCart();
                    break;
                case 3:
                    shop.checkout();
                    break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    return;
            }
        }
    }
}
