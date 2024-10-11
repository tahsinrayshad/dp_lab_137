public class Blank implements ICondiments{
    private String name = " ";
    private double cost = 0.00;

    private ICondiments condiment;

    public Blank() {

    }

    @Override
    public String getDescription() {
        return this.name;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
