package Notification;

public class TwitterNotification {
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public void delete() {
        System.out.println("Twitter notification deleted");
    }
}
