import java.util.ArrayList;

public class Bank {
    private final String name;
    ArrayList<IObserver> observers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.notifyObserver();
        }
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void giveMoney() {
        notifyObservers();
    }
}
