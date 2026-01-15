package org.example;

import java.util.List;

public interface IBackpack {

    boolean pack(Item item);

    boolean packAll(List<Item> itemsToPack);

    void clear();

    double getCurrentWeight();

    double getMaxWeight();

    List<Item> getItems();
}
