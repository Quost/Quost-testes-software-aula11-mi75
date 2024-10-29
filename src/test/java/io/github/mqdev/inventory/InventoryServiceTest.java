package io.github.mqdev.inventory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {
    private InventoryService service;

    @BeforeEach
    public void setup() {
        service = new InventoryService();
    }

    @Test
    public void testProductAvailability() {
        // Mocking a scenario
        service.addProduct("Laptop", 5);

        boolean available = service.isProductAvailable("Laptop");

        assertTrue(available);
    }

    @Test
    public void testOutOfStockProduct() {
        boolean available = service.isProductAvailable("Smartphone");

        assertFalse(available);
    }
}
