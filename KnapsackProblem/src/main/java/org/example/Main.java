package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SimpleBackpack simpleBackpack = new SimpleBackpack(10);
//
//        Item a = new Item("A", 6);
//        Item b = new Item("B", 5);
//        Item c = new Item("C", 4);
//
//        simpleBackpack.packAll(List.of(a, b, c));

//        GreedyBackpack backpack = new GreedyBackpack(10);
//
//        Item d = new Item("A", 8);
//        Item e = new Item("B", 6);
//        Item f = new Item("C", 4);
//
//        backpack.packAll(List.of(d, e, f));
//        System.out.println(backpack.getItems());
//        System.out.println(backpack.getCurrentWeight());

        OptimalBackpack backpack = new OptimalBackpack(10);

        Item a = new Item("A", 6);
        Item b = new Item("B", 5);
        Item c = new Item("C", 4);

        boolean result = backpack.packAll(List.of(a, b, c));

        System.out.println("Result = " + result);
        System.out.println("Packed items = " + backpack.getItems());
        System.out.println("Total weight = " + backpack.getCurrentWeight());
    }
}