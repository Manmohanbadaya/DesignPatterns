package ObserverPattern;

public class ObserverRunner {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        WeatherStation weatherStation = new WeatherStation();
        mobile.register(weatherStation);
        weatherStation.setTemeprature(33);
    }
}
