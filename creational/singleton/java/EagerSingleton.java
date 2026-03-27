public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "EagerSingleton@" + System.identityHashCode(this);
    }
}
