package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractBackpack implements IBackpack {

    protected final List<Item> items;
    protected final double maxWeight;

    public AbstractBackpack(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public double getCurrentWeight() {
        double countWeight = 0;
        for (Item item : items) {
            countWeight += item.getWeight();
        }
        return countWeight;
    }

    @Override
    public boolean pack(Item item) {
        double newWeight = getCurrentWeight() + item.getWeight();
        if (newWeight > maxWeight) {
            return false;
        } else {
            items.add(item);
            return true;
        }
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public abstract boolean packAll(List<Item> itemsToPack);
}
