package Homework_les_2;

public class Calc {

    public static void main(String[] args) {
        // Вводимо два числа
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        //Виводимо середнє арифметичне двох чисел
        System.out.println((a + b)/2);
    }
}
