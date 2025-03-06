public class WeatherData {
    private String location;
    private String condition;
    private double temperature;
    private String source;

    public WeatherData(String location, String condition, double temperature, String source) {
        this.location = location;
        this.condition = condition;
        this.temperature = temperature;
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("Weather in %s from %s: %.2f°C, %s", location, source, temperature, condition);
    }
}
