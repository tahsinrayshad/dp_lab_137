import java.util.HashMap;
import java.util.Map;

public class WeatherFacade {
    private IWeatherProvider openWeatherProvider = new OpenWeatherAdapter();
    private IWeatherProvider weatherStackProvider = new WeatherStackAdapter();
    private Map<String, WeatherData> cache = new HashMap<>();
    private long lastRequestTime = 0;
    private long rateLimit = 30 * 1000;

    public WeatherData getWeather(String location){
        if(cache.containsKey(location)){
            
        }
    }



}
