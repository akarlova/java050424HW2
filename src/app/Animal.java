package app;

public class Animal {

    private String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        System.out.println(name + " runs " + distance + " meters");
    }

    public void swim(int distance) {
        System.out.println(name + " swims " + distance + " meters");
    }

    public static void countAnimals() {
        System.out.println("Total quantity of animals: " + count);
    }
}
