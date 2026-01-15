package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreedyBackpack extends AbstractBackpack {

    public GreedyBackpack(double maxWeight) {
        super(maxWeight);
    }

    @Override
    public boolean packAll(List<Item> itemsToPack) {
        List<Item> copy = new ArrayList<>(itemsToPack);
        copy.sort(Collections.reverseOrder());

        boolean allPacked = true;
        for (Item item : copy) {
            if (!pack(item)) {
                allPacked = false;
            }
        }
        return allPacked;
    }
}
