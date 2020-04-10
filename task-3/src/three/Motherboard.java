package three;

public class Motherboard implements IProductPart, ILineStep {
    private IProductPart motherboard;

    public Motherboard() {
        this.motherboard = buildProductPart();
    }

    @Override
    public IProductPart buildProductPart() {
        System.out.println("New motherboard is built");
        return motherboard;
    }
}
