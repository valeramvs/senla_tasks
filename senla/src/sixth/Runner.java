package sixth;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Thing> thingSet = new ArrayList<>();
        System.out.println("List of all things:");
        for (int i = 0; i < 10; i++) {
            int weight = (int) (1 + Math.random() * 100);
            int cost = (int) (1 + Math.random() * 10000);
            Thing thing = new Thing(weight, cost);
            thingSet.add(thing);
            System.out.println("\t" + thing);
        }
        thingSet.sort(new SortByValue());
        Backpack backpack = new Backpack(300, new ArrayList<>());
        for (Thing thing : thingSet) {
            if (backpack.getCapacity() >= thing.getWeight()) {
                backpack.addToPack(thing);
            }
        }
        thingSet.removeAll(backpack.getPack());
        System.out.println("\nList of the remaining thing:");
        for (Thing thing : thingSet) {
            System.out.println("\t" + thing);
        }
        System.out.println("\nList of thing in a backpack:");
        for (Thing thing : backpack.getPack()) {
            System.out.println("\t" + thing);
        }
        System.out.println("Free space in a backpack is " + backpack.getCapacity());
    }
}
