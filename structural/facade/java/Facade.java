public class Facade {
    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();
    private final SubsystemC c = new SubsystemC();

    public String simpleOperation() {
        return a.operationA() + " | " + b.operationB() + " | " + c.operationC();
    }
}
