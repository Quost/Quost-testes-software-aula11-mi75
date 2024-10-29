package io.github.mqdev.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addProduct(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    public boolean isProductAvailable(String product) {
        return inventory.getOrDefault(product, 0) > 0;
    }
}
