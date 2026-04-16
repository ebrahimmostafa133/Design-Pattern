public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    protected NotifierDecorator(Notifier wrappee) { this.wrappee = wrappee; }
}
