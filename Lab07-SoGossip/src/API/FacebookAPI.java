package API;

import Notification.FacebookNotification;
import java.util.List;

public class FacebookAPI {
    public List<FacebookNotification> getNotifications() {
        // Simulate fetching notifications
        return List.of(new FacebookNotification());
    }
}
