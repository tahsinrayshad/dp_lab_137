import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherStackAdapter implements IWeatherProvider{
    private String apiKey = "d77e126ddbf02ac91f8df529bfbabe77";

    @Override
    public WeatherData getWeather(String location) throws IOException {
        String url = String.format("https://api.weatherstack.com/current?access_key=%s&query=%s", location, apiKey);

        return fetchWeather(url, "OpenWeatherMap");
    }

    private WeatherData fetchWeather(String apiUrl, String source) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");

        Scanner sc = new Scanner(connection.getInputStream());
        String response = sc.useDelimiter("\\A").next();
        sc.close();

        String location = response.split("\"name\":\"")[1].split("\",")[0];
        String condition = response.split("\"description\":\"")[1].split("\",")[0];
        double temperature = Double.parseDouble(response.split("\"temp\":")[1].split(",")[0]) - 273.15;

        return new WeatherData(location, condition, temperature, source);
    }
}
