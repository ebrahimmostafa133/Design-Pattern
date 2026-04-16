public class IteratorDemo {
    public static void main(String[] args) {
        System.out.println("=== Iterator Demo ===");
        ConcreteAggregate<String> agg = new ConcreteAggregate<>("one", "two", "three");
        MyIterator<String> it = agg.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
