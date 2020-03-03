package sixth;

import java.util.Objects;

public class Thing {
    private int weight;
    private int cost;
    private int value;

    public Thing(int weight,int cost) {
        this.weight = weight;
        this.cost = cost;
        this.value = cost/weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return weight == thing.weight &&
                cost == thing.cost &&
                value == thing.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost, value);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", value=" + value +
                '}';
    }
}
