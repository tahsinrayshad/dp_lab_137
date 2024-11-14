package API;
import Notification.TwitterNotification;

import java.util.List;

public class TwitterAPI {
    public List<TwitterNotification> getNotifications() {
        // Simulate fetching notifications
        return List.of(new TwitterNotification());
    }
}
