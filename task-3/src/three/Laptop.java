package three;

public class Laptop implements IProduct, IAssemblyLine {

    private Corpus corpus;
    private Monitor monitor;
    private Motherboard motherboard;
    private IProduct laptop;

    public Laptop() {
        this.laptop = assembleProduct(laptop);
    }

    @Override
    public void installFirstPart(IProductPart iProductPart) {
        corpus = new Corpus();
        System.out.println("Corpus is installed in Laptop");
    }

    @Override
    public void installSecondPart(IProductPart iProductPart) {
        monitor = new Monitor();
        System.out.println("Monitor is installed in Laptop");
    }

    @Override
    public void installThirdPart(IProductPart iProductPart) {
        motherboard = new Motherboard();
        System.out.println("Motherboard is installed in Laptop");
    }

    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        installFirstPart(corpus);
        installSecondPart(monitor);
        installThirdPart(motherboard);
        System.out.println("Laptop is assembled");
        return laptop;
    }

}
