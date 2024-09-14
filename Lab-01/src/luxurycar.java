public class luxurycar implements Iridetype {
    @Override
    public double calculateFare(double distance) {
        return distance*60;
    }
}
