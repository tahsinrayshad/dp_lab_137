import java.util.List;

public class Admin {
    private int id;
    private String name;
    private String role;

    // Constructor
    public Admin(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Admin behavior to manage drivers
    public void manageDriver(Driver driver, boolean isActive) {
        driver.setActive(isActive);
        System.out.println("Admin " + name + " has " + (isActive ? "activated" : "deactivated") + " driver: " + driver.getName());
    }

    // Admin behavior to manage riders
    public void manageRider(Rider rider, String action) {
        // Simulate rider management, like deactivation or other administrative tasks
        System.out.println("Admin " + name + " has performed action on rider " + rider.getName() + ": " + action);
    }

    // Admin behavior to view trip history
    public void viewTripHistory(List<Trip> tripHistory) {
        System.out.println("Admin " + name + " is viewing trip history:");
        for (Trip trip : tripHistory) {
            System.out.println("Trip ID: " + trip.getId() + ", Rider: " + trip.getRider().getName() +
                    ", Driver: " + trip.getDriver().getName() + ", Status: " + trip.getStatus());
        }
    }

    // Admin behavior to handle disputes between drivers and riders
    public void handleDispute(Trip trip, String resolution) {
        System.out.println("Admin " + name + " is handling a dispute for Trip ID: " + trip.getId() +
                " between Rider: " + trip.getRider().getName() + " and Driver: " + trip.getDriver().getName());
        // Simulate dispute handling logic (e.g., refund, warnings, etc.)
        System.out.println("Dispute resolved: " + resolution);
    }


}
