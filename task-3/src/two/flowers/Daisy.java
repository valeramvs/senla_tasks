package two.flowers;

public class Daisy extends Flower {
    public static final int PRICE = 3;

    public Daisy(int size) {
        super(size);
        setValue(PRICE * size);
    }
}
