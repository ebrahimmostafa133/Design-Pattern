public class ConcreteFlyweight implements Flyweight {
    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) { this.intrinsicState = intrinsicState; }

    @Override
    public String operation(String extrinsicState) {
        return "Flyweight[intrinsic=" + intrinsicState + "] using extrinsic=" + extrinsicState;
    }
}
