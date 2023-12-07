package Homework_les_2;
import java.util.Scanner;

public class Calc {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // Вводимо два числа
        double a = s.nextDouble();
        double b = s.nextDouble();

        //Виводимо середнє арифметичне двох чисел
        System.out.println((a + b)/2);
    }
}
