public class Paypal implements IpaymentMethods{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of: $" + amount);
    }
}
