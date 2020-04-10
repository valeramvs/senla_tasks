package three;

public class Corpus implements IProductPart, ILineStep {
    private IProductPart corpus;

    public Corpus() {
        this.corpus = buildProductPart();
    }

    @Override
    public IProductPart buildProductPart() {
        System.out.println("New corpus is built");
        return corpus;
    }
}
