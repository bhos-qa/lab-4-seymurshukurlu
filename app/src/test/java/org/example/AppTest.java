package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    App logic = new App();

    // 1. Test for processOrder method
    @Test
    public void testProcessOrder() {
        String result = logic.processOrder("123");
        assertEquals("Order 123 processed.", result);
    }

    // 2. Test for validateUser method
    @Test
    public void testValidateUser() {
        assertTrue(logic.validateUser("validUser123"));
        assertFalse(logic.validateUser("usr"));
    }

    // 3. Test for calculateDiscount method
    @Test
    public void testCalculateDiscount() {
        assertEquals(10.0, logic.calculateDiscount(100), 0.001);  // No discount
        assertEquals(15.0, logic.calculateDiscount(150), 0.001);  // 10% discount
    }

    // 4. Test for calculateTotalPrice method
    @Test
    public void testCalculateTotalPrice() {
        double result = logic.calculateTotalPrice(50, 2);  // 2 items at $50 each
        assertEquals(115.0, result, 0.001);  // 100 + 15% tax
    }

    // 5. Test for isShipmentDelivered method
    @Test
    public void testIsShipmentDelivered() {
        assertTrue(logic.isShipmentDelivered("DEL123456"));
        assertFalse(logic.isShipmentDelivered("PENDING123"));
    }
}