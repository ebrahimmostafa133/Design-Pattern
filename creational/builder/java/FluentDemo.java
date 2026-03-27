public class FluentDemo {
    public static void main(String[] args) {
        System.out.println("=== Fluent Builder Example ===");

        HouseFluent house = new HouseFluent.Builder()
                .foundation("Concrete with thermal insulation")
                .structure("Steel frame")
                .roof("Solar glass tiles")
                .interior("Designer finishings and smart-home")
                .build();

        System.out.println("Fluent house built: " + house);
    }
}
