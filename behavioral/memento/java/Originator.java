public class Originator {
    private String state;

    public void setState(String state) { this.state = state; }
    public String getState() { return state; }

    public Memento saveToMemento() { return new Memento(state); }
    public void restoreFromMemento(Memento m) { this.state = m.getState(); }
}
