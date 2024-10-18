package MyApplication;

public class PostalMailNotification{

    public void sendNotification(String message, String receiver, String address, int postalCode){
        System.out.println("Sending Notification through Postal Mail: \nRecipient Name: " + receiver +
                "\nAddress: " + address + "\nPostal Code: " + postalCode + "\nMessage: " + message + "\n");
    }
}
