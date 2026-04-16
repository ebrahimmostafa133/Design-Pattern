public class ConcreteColleague extends Colleague {
    private final String name;

    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String event) {
        System.out.println(name + " sends: " + event);
        mediator.notify(this, event);
    }

    public void receive(String event) {
        System.out.println(name + " receives: " + event);
    }
}
