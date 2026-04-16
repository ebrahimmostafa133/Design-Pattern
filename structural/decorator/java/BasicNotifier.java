public class BasicNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Send via basic channel: " + message;
    }
}
