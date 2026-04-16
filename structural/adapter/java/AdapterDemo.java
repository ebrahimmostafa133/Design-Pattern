public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("=== Adapter Demo ===");
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        System.out.println(adapter.request());
    }
}
