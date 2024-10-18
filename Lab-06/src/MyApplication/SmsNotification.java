package MyApplication;

public class SmsNotification implements INofity{

    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending Notification through SMS: \nMessage: " + message + "\nReceiver: " + receiver + "\n");
    }
}
