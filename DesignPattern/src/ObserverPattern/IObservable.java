package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public interface IObservable<T,  U> {
    void add(T observer);

    boolean remove(T observer);

    void notify(U data);
}
