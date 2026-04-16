import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> pool = new HashMap<>();

    public Flyweight getFlyweight(String intrinsic) {
        return pool.computeIfAbsent(intrinsic, ConcreteFlyweight::new);
    }
}
