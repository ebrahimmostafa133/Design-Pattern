public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return "EnumSingleton@" + System.identityHashCode(this);
    }
}
