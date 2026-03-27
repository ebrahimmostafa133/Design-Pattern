public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() { }

    // Not thread-safe
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton@" + System.identityHashCode(this);
    }
}
