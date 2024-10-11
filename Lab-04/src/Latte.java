public class Latte implements IBeverage{

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getPrice() {
        return 2.99;
    }
}
