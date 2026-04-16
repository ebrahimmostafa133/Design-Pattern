public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("=== Proxy Demo ===");
        Image img = new ProxyImage("photo.jpg");
        img.display();
        System.out.println("Call display again (should not load)");
        img.display();
    }
}
