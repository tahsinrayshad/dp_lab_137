package MyApplication;

public class EmailNotification implements INofity{

    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending Notification through Email: \nMessage: " + message + "\nReceiver: " + receiver + "\n");
    }
}
