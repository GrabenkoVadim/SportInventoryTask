package org.example;


import java.util.Arrays;
import java.util.Comparator;

public class Executor {
    public void execute() {
        try {
            SportInventory[] inventory = {
                    new SportInventory("Tennis Racket", "Tennis", 85.5, 0.6, 90),
                    new SportInventory("Football Ball", "Football", 45.0, 0.8, 70),
                    new SportInventory("Boxing Gloves", "Boxing", 60.0, 0.4, 80),
                    new SportInventory("Yoga Mat", "Fitness", 25.0, 1.2, 60),
                    new SportInventory("Basketball", "Basketball", 50.0, 0.7, 75)
            };

            Arrays.sort(inventory, Comparator
                    .comparing(SportInventory::getPrice)
                    .thenComparing(Comparator.comparing(SportInventory::getDurability).reversed())
            );

            System.out.println("Sorted inventory (by price ↑ and durability ↓):");

            for (SportInventory item : inventory) {
                System.out.println(item);
            }

            SportInventory target = new SportInventory("Boxing Gloves", "Boxing", 60.0, 0.4, 80);
            boolean found = false;

            for (SportInventory item : inventory) {
                if (item.equals(target)) {
                    System.out.println("\nFound identical item: " + item);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nNo identical item found.");
            }
        } catch (Exception e) {
        System.out.println("Error during program execution: " + e.getMessage());
    }
    }

}
