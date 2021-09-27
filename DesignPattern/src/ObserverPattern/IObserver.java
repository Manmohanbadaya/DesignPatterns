package ObserverPattern;

import java.util.Observer;

public interface IObserver<T> {
    void update( WeatherData weatherData);

    void register(T observable);
}
