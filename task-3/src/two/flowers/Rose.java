package two.flowers;

public class Rose extends Flower {
    public static final int PRICE = 10;

    public Rose(int size) {
        super(size);
        setValue(PRICE * size);
    }

}
