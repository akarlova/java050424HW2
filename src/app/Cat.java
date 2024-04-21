package app;

public class Cat extends Animal {

    private static final int MAX_RUNNING = 200;
    public static int count;

    public Cat(String name){
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance > MAX_RUNNING){
            System.out.println(getName() + "can't run such long distance");
        } else{
            System.out.println(getName() + " runs " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Sorry, Human, I can't swim, mew");
    }
    public void countCats() {
        System.out.println("Quantity of cats: " + count);
    }
}
