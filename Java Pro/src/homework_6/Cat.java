package homework_6;

public class Cat extends Animal {
    static final int MAX_RUN_DISTANCE = 200;
    static final int MAX_SWIM_DISTANCE = 0;  // Кіт не вміє плавати

    Cat(String name) {
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
        System.out.println(name + " can't swim!");
    }
}











