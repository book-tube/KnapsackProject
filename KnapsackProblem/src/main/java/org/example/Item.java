package org.example;

import java.util.Objects;

public class Item {
    protected final String name;
    protected final double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item other)) return false;
        return Double.compare(this.weight, other.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(weight);
    }
}
