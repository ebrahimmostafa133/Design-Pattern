import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> history = new ArrayList<>();

    public void addMemento(Memento m) { history.add(m); }
    public Memento getMemento(int index) { return history.get(index); }
}
