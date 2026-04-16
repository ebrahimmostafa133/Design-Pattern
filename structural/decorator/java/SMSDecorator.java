public class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier wrappee) { super(wrappee); }

    @Override
    public String send(String message) {
        String result = wrappee.send(message);
        return result + " + SMS(" + message + ")";
    }
}
