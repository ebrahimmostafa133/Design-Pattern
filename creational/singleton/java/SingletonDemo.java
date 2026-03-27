public class SingletonDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Singleton examples ===");

        System.out.println("Eager: " + EagerSingleton.getInstance());
        System.out.println("Lazy: " + LazySingleton.getInstance());
        System.out.println("Synchronized Lazy: " + SynchronizedLazySingleton.getInstance());
        System.out.println("DCL: " + DCLSingleton.getInstance());
        System.out.println("Bill Pugh: " + BillPughSingleton.getInstance());
        System.out.println("Enum: " + EnumSingleton.INSTANCE);

        System.out.println();
        System.out.println("Lazy same instance? " + (LazySingleton.getInstance() == LazySingleton.getInstance()));
        System.out.println("DCL same instance? " + (DCLSingleton.getInstance() == DCLSingleton.getInstance()));

        // quick thread test for DCL (should print the same identity twice)
        Runnable r = () -> System.out.println("Thread DCL: " + DCLSingleton.getInstance());
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
