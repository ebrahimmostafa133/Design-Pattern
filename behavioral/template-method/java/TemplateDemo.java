public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("=== Template Method Demo ===");
        Game game = new Chess();
        game.play();
        game = new Soccer();
        game.play();
    }
}
