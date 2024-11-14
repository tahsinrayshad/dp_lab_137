package Adapter;

import Interface.INotification;
import Notification.FacebookNotification;

public class FacebookNotificationAdapter implements INotification {

    private FacebookNotification facebookNotification;

    public FacebookNotificationAdapter(FacebookNotification facebookNotification) {
        this.facebookNotification = facebookNotification;
    }

    public void markAsRead() {
        System.out.println("Marked as read on Facebook");
    }

    public void markAsUnread() {
        System.out.println("Marked as unread on Facebook");
    }

    public void delete() {
        System.out.println("Deleted on Facebook");
    }
}
