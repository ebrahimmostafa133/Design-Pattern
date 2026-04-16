public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) { this.next = next; }

    public void handle(int request) {
        if (next != null) next.handle(request);
    }
}
