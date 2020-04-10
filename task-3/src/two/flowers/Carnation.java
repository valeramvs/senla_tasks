package two.flowers;

public class Carnation extends Flower {
    public static final int PRICE = 5;

    public Carnation(int size) {
        super(size);
        setValue(PRICE * size);
    }
}
