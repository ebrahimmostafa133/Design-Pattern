import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer o) { observers.add(o); }
    public void detach(Observer o) { observers.remove(o); }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() { return state; }

    private void notifyObservers() {
        for (Observer o : observers) o.update(state);
    }
}
