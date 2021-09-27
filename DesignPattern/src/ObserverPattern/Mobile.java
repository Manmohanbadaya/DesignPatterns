package ObserverPattern;

public class Mobile implements IObserver<WeatherStation> {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current Data on Mobile Display " + weatherData.getTemeprature());
    }

    @Override
    public void register(WeatherStation observable) {
        observable.add(this);
    }
}
