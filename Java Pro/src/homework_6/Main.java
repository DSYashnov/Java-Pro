package homework_6;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        Cat catMurka = new Cat("Myrka");

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurka.run(250);
        catMurka.swim(3);

        System.out.println("Total number of animals: " + Animal.totalAnimals);
    }

}
