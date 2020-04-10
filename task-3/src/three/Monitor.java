package three;

public class Monitor implements IProductPart,ILineStep {
    private IProductPart monitor;

    public Monitor() {
        this.monitor = buildProductPart();
    }

    @Override
    public IProductPart buildProductPart() {
        System.out.println("New monitor is built");
        return monitor;
    }
}
