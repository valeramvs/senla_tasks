package two.flowers;

public abstract class Flower {

    private int value;
    private int size;

    public Flower() {
    }

    public Flower(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
