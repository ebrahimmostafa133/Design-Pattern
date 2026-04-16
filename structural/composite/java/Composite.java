import java.util.ArrayList;
import java.util.List;

public class Composite implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    public void add(Graphic g) { children.add(g); }

    @Override
    public void print() {
        System.out.println("Composite: start");
        for (Graphic g : children) g.print();
        System.out.println("Composite: end");
    }
}
