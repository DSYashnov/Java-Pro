package homework_6;

public class Animal {
    static int totalAnimals = 0;

    String name;

    Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    void run(int distance) {
        System.out.println(name + " run " + distance + " m");
    }

    void swim(int distance) {
        System.out.println(name + " swam " + distance + " m");
    }
}

