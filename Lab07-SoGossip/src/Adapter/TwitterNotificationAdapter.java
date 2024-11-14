package Adapter;

import Interface.INotification;
import API.TwitterAPI;
import Notification.TwitterNotification;

public class TwitterNotificationAdapter implements INotification {

    private TwitterNotification twitterNotification;

    public TwitterNotificationAdapter(TwitterNotification twitterNotification) {
        this.twitterNotification = twitterNotification;
    }

    @Override
    public void markAsRead() {
        System.out.println("Marked as read on Twitter");
    }

    @Override
    public void markAsUnread() {
        System.out.println("Marked as unread on Twitter");
    }

    @Override
    public void delete() {
        System.out.println("Deleted on Twitter");
    }
}
