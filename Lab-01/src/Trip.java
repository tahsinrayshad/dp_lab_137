public class Trip {

    private int id;
    private Iridetype rideType;
    private IpaymentMethods paymentMethod;
    private NotificationManager notificationManager;
    private Driver driver;
    private Rider rider;
    private double distance;
    private double timeOfDay;
    private double fare;
    private String status;

    public Trip(String rideType, IpaymentMethods paymentMethod, NotificationManager notificationManager, Driver driver, Rider rider, double distance, double timeOfDay) {
        this.rideType = RideTypeFactory.getRideType(rideType);
        this.paymentMethod = paymentMethod;
        this.notificationManager = notificationManager;
        this.driver = driver;
        this.rider = rider;
        this.distance = distance;
        this.timeOfDay = timeOfDay;
        this.fare = this.rideType.calculateFare(distance);
        this.status = "REQUESTED";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(double timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Iridetype getRideType() {
        return rideType;
    }

    public void setRideType(Iridetype rideType) {
        this.rideType = rideType;
    }

    public IpaymentMethods getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setPaymentMethod(IpaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void setNotificationManager(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public void startTrip() {
        notificationManager.notifyAllServices("Trip started with driver " + driver.getName());
        status = "TRIP STARTED";
        System.out.println("Trip started from " + rider.getLocation());
    }

    public void completeTrip() {
        notificationManager.notifyAllServices("Trip completed for rider " + rider.getName());
        paymentMethod.processPayment(fare);
        System.out.println("Trip completed. Fare: $" + fare);
        status = "TRIP COMPLETED";

    }
}
