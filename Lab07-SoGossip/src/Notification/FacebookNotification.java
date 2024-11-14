package Notification;

public class FacebookNotification {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void delete() {
        System.out.println("Facebook notification deleted");
    }
}
