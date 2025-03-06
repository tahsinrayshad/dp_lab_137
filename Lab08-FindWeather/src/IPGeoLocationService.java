import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class IPGeoLocationService {
    private String apiKey = "26cb04e123d1868aec164732da59184d";

    public String getLocationByIP() throws IOException {
        String ipApiUrl = "https://api.ipify.org";
        HttpURLConnection connection = (HttpURLConnection) new URL(ipApiUrl).openConnection();
        connection.setRequestMethod("GET");

        Scanner sc = new Scanner(connection.getInputStream());
        String ipAddr = sc.useDelimiter("\\A").next();
        sc.close();

        String geoApiUrl = String.format(("https://api.ipgeolocation.io/ipgeo?apiKey=%s&ip=%s"), apiKey, ipAddr);
        connection = (HttpURLConnection) new URL(geoApiUrl).openConnection();
        connection.setRequestMethod("GET");

        sc = new Scanner(connection.getInputStream());
        String response = sc.useDelimiter("\\A").next();
        sc.close();

        String city = response.split("\"city\":\"")[1].split("\",")[0];

        return city;
    }
}
