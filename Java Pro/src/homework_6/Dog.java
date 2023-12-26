package homework_6;

public class Dog extends Animal{
    static final int MAX_RUN_DISTANCE = 500;
    static final int MAX_SWIM_DISTANCE = 10;

    Dog(String name) {
        super(name);
    }

    @Override
    void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " can't run anymore " + MAX_RUN_DISTANCE + " m");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(name + " can't swim any further " + MAX_SWIM_DISTANCE + " m");
        }
    }
}
