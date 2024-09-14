public class InappNotification implements InotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Inapp notification: " + message);
    }
}
