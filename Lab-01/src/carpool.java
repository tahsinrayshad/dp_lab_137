public class carpool implements Iridetype {
    @Override
    public double calculateFare(double distance) {
        return distance * 40;
    }
}
