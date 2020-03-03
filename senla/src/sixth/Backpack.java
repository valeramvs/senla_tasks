package sixth;

import java.util.ArrayList;
import java.util.Objects;

public class Backpack {
    private int capacity;
    private ArrayList<Thing> pack;

    public Backpack(int capacity, ArrayList<Thing> pack) {
        this.capacity = capacity;
        this.pack = pack;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Thing> getPack() {
        return pack;
    }

    public void addToPack(Thing thing) {
        pack.add(thing);
        this.capacity = capacity - thing.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return capacity == backpack.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "capacity=" + capacity +
                '}';
    }
}
