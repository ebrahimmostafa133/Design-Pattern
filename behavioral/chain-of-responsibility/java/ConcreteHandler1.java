public class ConcreteHandler1 extends Handler {
    @Override
    public void handle(int request) {
        if (request < 10) System.out.println("Handler1 handled: " + request);
        else super.handle(request);
    }
}
