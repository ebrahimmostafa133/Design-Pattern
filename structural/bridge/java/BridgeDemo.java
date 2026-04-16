public class BridgeDemo {
    public static void main(String[] args) {
        System.out.println("=== Bridge Demo ===");
        Device tv = new TV();
        Remote remote = new BasicRemote(tv);
        remote.togglePower();
        remote.togglePower();
    }
}
