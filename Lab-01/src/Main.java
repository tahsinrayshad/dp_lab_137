public class Main {
    public static void main(String[] args) {
        // Creating Driver, Rider, and Admin
        Driver driver = new Driver("John", "Car", "Downtown", 4.9);
        Rider rider = new Rider(1, "Jane", "Uptown", 4.8);

        // Creating Payment method (Strategy)
        IpaymentMethods paymentMethod = new CreditCard();

        // Creating NotificationManager (Observer)
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addService(new SmsNotification());
        notificationManager.addService(new EmailNoification());

        // Creating Trip (Factory, Strategy, and Observer in action)
        Trip trip = new Trip("carpool", "Paypal", notificationManager, driver, rider, 10.0);

        // Starting and completing trip
        trip.startTrip();
        trip.completeTrip();

        // Admin Operations (Command pattern)
        Admin admin = new Admin(1, "Admin", "Supervisor");


    }

}
