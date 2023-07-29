public class DogApp {
    public static void main(String[] args) {

        System.out.println("");
        Dog d1 = new Dog();
        d1.name = "scooby";
        d1.breed = "labradon";
        System.out.println("Details of dog 1");
        System.out.println("name " + d1.name);
        System.out.println("breed " + d1.breed);
        d1.bark();

        System.out.println(" ");
        System.out.println("details of dog 2");
        Dog d2 = new Dog();
        d2.name = "Tommy";
        d2.breed = "pug ";
        System.out.println("details of dog 2");
        System.out.println("name " + d2.name);
        System.out.println("breed " + d2.breed);
        d2.bark();

        System.out.println(" ");
        System.out.println("Details of dog 3");
        Dog d3 = new Dog();
        d3.name = "buddy";
        d3.breed = "germen shepbard";
        System.out.println("name " + d3.name);
        System.out.println("breed " + d3.breed);
        d3.bark();

        System.out.println("  ");
        System.out.println("detaials of dog 4");
        Dog d4 = new Dog();
        d4.name = "doodle ";
        d4.breed = "matsif ";
        System.out.println("name" + d4.name);
        System.out.println("breed" + d4.breed);
        d4.bark();

        System.out.println(" ");
        System.out.println("details of dog 5");
        Dog d5 = new Dog();
        d5.name = "coco";
        d5.breed = "poodle";
        System.out.println("name" + d5.name);
        System.out.println("breed" + d5.breed);
        d5.bark();

    }
}
