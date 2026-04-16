public class ConcreteMediator implements Mediator {
    private ConcreteColleague c1;
    private ConcreteColleague c2;

    public void register(ConcreteColleague c1, ConcreteColleague c2) {
        this.c1 = c1; this.c2 = c2;
    }

    @Override
    public void notify(Colleague sender, String event) {
        if (sender == c1) {
            System.out.println("Mediator reacts on event from c1 and triggers c2");
            c2.receive(event + " (via mediator)");
        } else if (sender == c2) {
            System.out.println("Mediator reacts on event from c2 and triggers c1");
            c1.receive(event + " (via mediator)");
        }
    }
}
