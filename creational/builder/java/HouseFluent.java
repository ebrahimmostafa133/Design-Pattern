public class HouseFluent {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final String interior;

    private HouseFluent(Builder b) {
        this.foundation = b.foundation;
        this.structure = b.structure;
        this.roof = b.roof;
        this.interior = b.interior;
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public Builder foundation(String foundation) { this.foundation = foundation; return this; }
        public Builder structure(String structure) { this.structure = structure; return this; }
        public Builder roof(String roof) { this.roof = roof; return this; }
        public Builder interior(String interior) { this.interior = interior; return this; }

        public HouseFluent build() {
            return new HouseFluent(this);
        }
    }

    @Override
    public String toString() {
        return "HouseFluent{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
