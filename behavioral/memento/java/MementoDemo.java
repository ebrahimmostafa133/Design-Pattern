public class MementoDemo {
    public static void main(String[] args) {
        System.out.println("=== Memento Demo ===");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        caretaker.addMemento(originator.saveToMemento());

        originator.setState("State2");
        caretaker.addMemento(originator.saveToMemento());

        originator.setState("State3");
        System.out.println("Current state: " + originator.getState());

        originator.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored to: " + originator.getState());
    }
}
