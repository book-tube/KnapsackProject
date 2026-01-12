package org.example;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    protected final List<Item> items;
    protected final double maxWeight;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public void clear() {
        items.clear();
    }


    public double getCurrentWeight() {
        double countWeight = 0;

        for (Item item : items) {
            countWeight += item.getWeight();
        }
        return countWeight;
    }

    public boolean pack(Item item) {
        double newWeight = getCurrentWeight() + item.getWeight();
        if (newWeight > maxWeight) {
            return false;
        }
        else {
            items.add(item);
            return true;
        }
    }
}
