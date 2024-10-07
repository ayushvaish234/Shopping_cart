# E-Commerce Shopping Cart

Welcome to the <strong>E-Commerce Shopping Cart</strong> project! This is a console-based application written in Java that simulates a simple e-commerce shopping experience, where users can view products, add them to a shopping cart, and proceed to checkout.

## Features

- <strong>View Products</strong>: Displays a list of products available for purchase with prices.
- <strong>Add to Cart</strong>: Allows users to add products to their shopping cart.
- <strong>View Cart</strong>: Shows the items in the shopping cart, including their quantity and price.
- <strong>Remove from Cart</strong>: Users can remove items from their cart.
- <strong>Checkout</strong>: Displays the total cost of the items in the cart and completes the purchase.

## How It Works

1. **View Products**: A list of available products, including laptops, smartphones, keyboards, and mice, is displayed.
2. **Add to Cart**: The user selects the product they want to add to the cart by entering the product number.
3. **View Cart**: The shopping cart is displayed, showing the products added, quantities, and total price.
4. **Remove Items**: Users can remove products from their cart.
5. **Checkout**: The total cost of items in the cart is displayed when the user checks out.

## Project Structure

- **`product.java`**: The `Product` class models the product entity with attributes like name, quantity, and price.
- **`shop.java`**: The `Shop` class manages the product catalog, shopping cart, and user interactions.
- **`shopping_cart.java`**: The main class provides the user interface for interacting with the shop system.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor and terminal

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/ayushvaish234/Shopping_cart.git
2. Compile the Java files:
   ```bash
   javac shopping_cart.java
3. Run the application:
   ```bash
   java shopping_cart
## Usage
When the application starts, you will be greeted with a menu of options:

- **View Products:** To view the list of available products.
- **View Cart:** To view items you have added to the shopping cart.
- **Checkout:** To complete the purchase and display the total cost.
- **Exit:** To quit the application.
