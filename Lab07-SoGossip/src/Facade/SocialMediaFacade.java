package Facade;


import API.FacebookAPI;
import API.TwitterAPI;
import Adapter.TwitterNotificationAdapter;
import Interface.INotification;
import Notification.FacebookNotification;
import Notification.TwitterNotification;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFacade {
    private List<INotification> notifications;

    public SocialMediaFacade() {
        this.notifications = new ArrayList<>();
    }

    public void fetchAllNotifications() {
        // Fetch notifications from all platforms
        TwitterAPI twitterAPI = new TwitterAPI();
        for (TwitterNotification twitterNotification : twitterAPI.getNotifications()) {
            notifications.add(new TwitterNotificationAdapter(twitterNotification));
        }

        // Add Facebook, LinkedIn, etc. notifications similarly

        FacebookAPI facebookAPI = new FacebookAPI();
        for (FacebookNotification facebookNotification : facebookAPI.getNotifications()) {
            notifications.add(new Adapter.FacebookNotificationAdapter(facebookNotification));
        }
    }

    public void markAllAsRead() {
        for (INotification notification : notifications) {
            notification.markAsRead();
        }
    }

    public void markAllAsUnread() {
        for (INotification notification : notifications) {
            notification.markAsUnread();
        }
    }

    public void deleteAll() {
        for (INotification notification : notifications) {
            notification.delete();
        }
    }
}
