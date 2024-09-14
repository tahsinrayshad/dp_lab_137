public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating;

    public Rider(int id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void requestRide(String rideType) {
        System.out.println("Rider " + name + " has requested a " + rideType + " ride.");
    }

    // Make a payment
    public void makePayment(IpaymentMethods paymentMethod, double fare) {
        paymentMethod.processPayment(fare);
        System.out.println("Rider " + name + " has made a payment of $" + fare);
    }

    // Rate the driver
    public void rateDriver(Driver driver, double rating) {
        System.out.println("Rider " + name + " rated driver " + driver.getName() + ": " + rating);
        driver.setRating((driver.getRating() + rating) / 2); // Example of updating driver's rating
    }


}