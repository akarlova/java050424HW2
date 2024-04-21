package app;

public class Dog extends Animal {

    private static final int MAX_RUNNING = 500;
    private static final int MAX_SWIMMING = 10;
    public static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

public void run(int distance){
        if(distance > MAX_RUNNING){
            System.out.println(getName() + "can't run such long distance");
        } else{
            System.out.println(getName() + " runs " + distance + " meters");
        }
}

    @Override
    public void swim(int distance) {
        if(distance > MAX_SWIMMING){
            System.out.println(getName() + " can't swim such long distance");
        } else{
            System.out.println(getName() + " swims " + distance + " meters");
        }
    }


    public void countDogs() {
        System.out.println("Quantity of dogs: " + count);
    }
}
