import java.io.IOException;

public interface IWeatherProvider {
    WeatherData getWeather(String location) throws IOException;
}