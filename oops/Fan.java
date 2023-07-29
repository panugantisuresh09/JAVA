public class Fan {
    String brand;
    String colour;
    int cost;

    void blowsair() {
        System.out.println(brand + "fan is blowing ");

    }

    void rotates() {
        System.out.println(brand + "colour" + "colour fan is rotating");
    }

    public Fan(String a, String b, int c) {
        brand = a;
        colour = b;
        cost = c;
    }

}
