public class ConcreteHandler2 extends Handler {
    @Override
    public void handle(int request) {
        if (request >= 10) System.out.println("Handler2 handled: " + request);
        else super.handle(request);
    }
}
