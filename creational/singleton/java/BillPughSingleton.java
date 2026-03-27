public class BillPughSingleton {
    private BillPughSingleton() { }

    private static class Holder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public String toString() {
        return "BillPughSingleton@" + System.identityHashCode(this);
    }
}
