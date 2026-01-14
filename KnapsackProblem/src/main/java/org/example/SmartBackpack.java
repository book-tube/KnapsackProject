package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartBackpack extends Backpack {

    public SmartBackpack(double maxWeight) {
        super(maxWeight);
    }

    public boolean packAll(List<Item> itemsToPack) {

        double freeSpace = maxWeight - getCurrentWeight();

        double total = 0;
        for (Item i : itemsToPack){
            total += i.getWeight();
        }

        if (total <= freeSpace) {
            for (Item i : itemsToPack) {
                pack(i);
            }
            return true;
        }

        List<Item> copyItemsToPack = new ArrayList<>(itemsToPack);

        copyItemsToPack.sort(Collections.reverseOrder());

        List<Item> best = new ArrayList<>();
        findBestSubset(copyItemsToPack, 0, freeSpace, new ArrayList<>(), 0, best);

        for (Item i : best) {
            pack(i);
        }

        return false;
    }

    private void findBestSubset(List<Item> items, int index, double capacity,
                                List<Item> current, double currentWeight,
                                List<Item> best) {

        if (currentWeight > sumWeight(best)) {
            best.clear();
            best.addAll(current);
        }

        if (index >= items.size()){
            return;
        }

        findBestSubset(items, index + 1, capacity, current, currentWeight, best);

        Item item = items.get(index);
        if (currentWeight + item.getWeight() <= capacity) {
            current.add(item);
            findBestSubset(items, index + 1, capacity, current, currentWeight + item.getWeight(), best);
            current.remove(current.size() - 1);
        }
    }

    private double sumWeight(List<Item> list) {
        double sum = 0;
        for (Item i : list){
            sum += i.getWeight();
        }
        return sum;
    }
}
