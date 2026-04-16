public class Leaf implements Graphic {
    private final String name;

    public Leaf(String name) { this.name = name; }

    @Override
    public void print() { System.out.println("Leaf: " + name); }
}
