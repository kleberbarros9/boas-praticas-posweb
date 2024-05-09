package br.unipe.boaspraticas.exercicios.oc;

import br.unipe.boaspraticas.respostas.solid.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    public void removeItem(Item item) {
        if (item == null || !items.contains(item)) {
            throw new IllegalArgumentException("Item not found or cannot be null");
        }
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(item -> item.getPrice()).sum();
    }

    public void printItems() {
        items.forEach(item -> System.out.println(item.getName() + " - $" + item.getPrice()));
    }
}



