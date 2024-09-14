public class DigitalWallet implements IpaymentMethods{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing digital wallet payment of: $" + amount);
    }
}
