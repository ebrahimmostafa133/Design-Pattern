public abstract class Creator {
    // Subclasses decide which product to create
    public abstract Product factoryMethod();

    // Business logic can use products without knowing their concrete classes
    public String someOperation() {
        Product product = factoryMethod();
        return "Creator: created -> " + product.use();
    }
}
