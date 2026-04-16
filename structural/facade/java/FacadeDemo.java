public class FacadeDemo {
    public static void main(String[] args) {
        System.out.println("=== Facade Demo ===");
        Facade facade = new Facade();
        System.out.println(facade.simpleOperation());
    }
}
