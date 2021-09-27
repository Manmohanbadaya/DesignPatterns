package ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable<IObserver<?>, WeatherData> {
    private final ArrayList<IObserver> observers = new ArrayList<>();

    public String getType() {
        return "I am weather station";
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public boolean remove(IObserver observer) {
        return observers.remove(observer);
    }

    @Override
    public void notify(WeatherData data) {
        observers.forEach(o -> o.update(data));
    }

    public void setTemeprature(int temp) {
        notify(new WeatherData(temp));
    }
}
