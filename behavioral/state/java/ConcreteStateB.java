public class ConcreteStateB implements State {
    @Override
    public void handle(Context ctx) {
        System.out.println("State B handling request and switching to A");
        ctx.setState(new ConcreteStateA());
    }
}
