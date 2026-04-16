public class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier wrappee) { super(wrappee); }

    @Override
    public String send(String message) {
        String result = wrappee.send(message);
        return result + " + Email(" + message + ")";
    }
}
