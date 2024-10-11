public class WhippedCream implements ICondiments{
    private String name = "Whipped Cream";
    private double cost = 0.50;

    private ICondiments condiment;

    public WhippedCream(ICondiments condiment) {
        this.condiment = condiment;
    }

    @Override
    public String getDescription() {
        return this.name+", "+condiment.getDescription();
    }

    @Override
    public double getCost() {
        return this.cost+condiment.getCost();
    }
}
