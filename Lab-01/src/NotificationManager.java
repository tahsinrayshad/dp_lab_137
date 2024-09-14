import java.util.ArrayList;
import java.util.List;
public class NotificationManager {
    private List<InotificationService> services = new ArrayList<>();

    public void addService(InotificationService service) {
        services.add(service);
    }

    public void notifyAllServices(String message) {
        for (InotificationService service : services) {
            service.sendNotification(message);
        }
    }
}
