package homework_les_3;

public class Hw3_04_2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value  = Integer.parseInt(args[0]);
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= value);

        System.out.println("Факториал " + value + "! = " + factorial);
    }
}
