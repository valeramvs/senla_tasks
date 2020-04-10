package two.flowers;

public class Peony extends Flower {
    public static final int PRICE = 7;

    public Peony(int size) {
        super(size);
        setValue(PRICE * size);
    }
}
