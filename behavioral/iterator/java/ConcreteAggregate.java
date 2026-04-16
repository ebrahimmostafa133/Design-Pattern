public class ConcreteAggregate<T> {
    private final T[] items;

    @SafeVarargs
    public ConcreteAggregate(T... items) { this.items = items; }

    public MyIterator<T> iterator() {
        return new MyIterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() { return index < items.length; }

            @Override
            public T next() { return items[index++]; }
        };
    }
}
