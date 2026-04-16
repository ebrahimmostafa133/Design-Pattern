public class MediatorDemo {
    public static void main(String[] args) {
        System.out.println("=== Mediator Demo ===");
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague c1 = new ConcreteColleague(mediator, "Colleague1");
        ConcreteColleague c2 = new ConcreteColleague(mediator, "Colleague2");
        mediator.register(c1, c2);

        c1.send("Hello from C1");
        c2.send("Reply from C2");
    }
}
