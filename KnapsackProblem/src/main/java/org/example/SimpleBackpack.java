package org.example;

import java.util.List;

public class SimpleBackpack extends AbstractBackpack {

    public SimpleBackpack(double maxWeight) {
        super(maxWeight);
    }

    @Override
    public boolean packAll(List<Item> itemsToPack) {
        boolean allPacked = true;

        for (Item item : itemsToPack) {
            if (!pack(item)) {
                allPacked = false;
            }
        }

        return allPacked;
    }
}
