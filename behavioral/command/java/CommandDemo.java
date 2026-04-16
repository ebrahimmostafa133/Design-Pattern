public class CommandDemo {
    public static void main(String[] args) {
        System.out.println("=== Command Demo ===");
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(cmd);
        invoker.invoke();
    }
}
