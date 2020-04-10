package two.bouquet;

import two.flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    public ArrayList<Flower> bunch = new ArrayList<>();
    private int cost;

    public int getCost() {
        for (Flower flower : bunch) {
            cost += flower.getValue();
        }
        return cost;
    }
}
