public class ridetypefactory {
    public Iridetype getRideType(String rideType) {
        if (rideType.equalsIgnoreCase("LuxuryCar"))
            return new luxurycar();
        if (rideType.equalsIgnoreCase("BIKERIDE")) {
            return new bikeride();
        }
        if (rideType.equalsIgnoreCase("CARPOOL")) {
            return new carpool();
        }
        return null;
    }
}
