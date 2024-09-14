public class Driver {

    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean isAvailable;
    private boolean isActive;

    // Constructor
    public Driver(String name, String vehicleType, String location, double rating) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.isAvailable = true;
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void acceptRide() {
        System.out.println("Driver " + name + " has accepted the ride.");
        this.isAvailable = false; // Set to unavailable when ride is accepted
    }

    public void startTrip() {
        System.out.println("Driver " + name + " has started the trip.");
    }

    public void completeTrip() {
        System.out.println("Driver " + name + " has completed the trip.");
        this.isAvailable = true; // Set back to available after the trip
    }

    public void rateRider(Rider rider, double rating) {
        System.out.println("Driver " + name + " rated rider " + rider.getName() + ": " + rating);
        rider.setRating((rider.getRating() + rating) / 2); // Example of updating rider's rating
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
        if (!isActive) {
            this.isAvailable = false;
        }
        System.out.println("Driver " + name + " is now " + (isActive ? "active" : "deactivated") + ".");
    }

}
