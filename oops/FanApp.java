public class FanApp {
    public static void main(String[] args) {
        Fan f1 = new Fan("crompton", "white", 3000);

        f1.blowsair();
        f1.rotates();
        System.out.println("=============================");
        new Fan("usha", "blue", 3000).rotates();

    }

}