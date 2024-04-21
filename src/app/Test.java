package app;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal("Jack");
        animal.run(150);
        animal.swim(40);
        Animal animal2 = new Animal("Ghost");

        Dog dog = new Dog("Totoshka");
        dog.run(300);
        dog.swim(20);
        dog.countDogs();

        Cat cat = new Cat("Murzik");
        cat.run(50);
        cat.swim(5);
        Cat cat2 = new Cat("Sally");
        cat.countCats();

        Animal.countAnimals();
    }
}
