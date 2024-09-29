package org.example;

public class App {

    // 1. A simple order processing method
    public String processOrder(String orderId) {
        return "Order " + orderId + " processed.";
    }

    // 2. Validate user based on a simple rule
    public boolean validateUser(String userId) {
        return userId != null && userId.length() > 5;
    }

    // 3. Calculate discount based on amount
    public double calculateDiscount(double amount) {
        if (amount >= 100) {
            return amount * 0.10;  // 10% discount
        }
        return 0;
    }

    // 4. Get user role
    public String getUserRole(String userId) {
        if (userId.equals("admin123")) {
            return "Administrator";
        } else {
            return "User";
        }
    }

    // 5. Check if item is in stock
    public boolean isItemInStock(String itemId) {
        return !itemId.isEmpty();  // Mock check for now
    }

    // 6. Calculate total price (with tax)
    public double calculateTotalPrice(double price, int quantity) {
        double totalPrice = price * quantity;
        double tax = totalPrice * 0.15;  // Assume 15% tax
        return totalPrice + tax;
    }

    // 7. Convert currency from USD to EUR
    public double convertCurrency(double amountUSD) {
        double conversionRate = 0.85;  // Assume 1 USD = 0.85 EUR
        return amountUSD * conversionRate;
    }

    // 8. Generate invoice number (mock implementation)
    public String generateInvoiceNumber() {
        return "INV-" + (int)(Math.random() * 10000);
    }

    // 9. (Vulnerable) Method that simulates insecure database query (SQL injection vulnerability)
    public String getCustomerInfo(String customerId) {
        // Vulnerable query (example)
        return "SELECT * FROM customers WHERE customerId = '" + customerId + "'";
    }

    // 10. Check if shipment is delivered
    public boolean isShipmentDelivered(String shipmentId) {
        return shipmentId != null && shipmentId.startsWith("DEL");
    }
}