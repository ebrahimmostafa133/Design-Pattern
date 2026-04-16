public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("=== Decorator Demo ===");
        Notifier notifier = new BasicNotifier();
        notifier = new EmailDecorator(notifier);
        notifier = new SMSDecorator(notifier);
        System.out.println(notifier.send("Hello"));
    }
}
