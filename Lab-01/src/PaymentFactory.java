public class PaymentFactory {
    public static IpaymentMethods getPaymentTYpe(String payType){
        if(payType.equalsIgnoreCase("CREDIT")){
            return new CreditCard();
        }

        if(payType.equalsIgnoreCase("DIGITAL")){
            return new DigitalWallet();
        }

        if(payType.equalsIgnoreCase("PAYPAL")){
            return new Paypal();
        }

        return null;
    }
}
