public class EmailNoification implements InotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}
