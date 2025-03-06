import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenWeatherAdapter implements IWeatherProvider{
    private String apiKey = "cbcad4850de830fa73c7fd580c683c4f";

    @Override
    public WeatherData getWeather(String location) throws IOException {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", location, apiKey);

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
