public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("=== Observer Demo ===");
        Subject subject = new Subject();
        ConcreteObserver o1 = new ConcreteObserver("Observer1");
        ConcreteObserver o2 = new ConcreteObserver("Observer2");
        subject.attach(o1);
        subject.attach(o2);

        subject.setState("State 1");
        subject.detach(o1);
        subject.setState("State 2");
    }
}
