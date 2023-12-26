package homework_2;
import java.util.Scanner;

public class Hw2_02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        double sum = 0;
        while (true) {
            double value = s.nextDouble();
            //якщо вести НЕ число, то цикл припиняє працювати і рахує середнє арифметичне значення введених чисел
            if (s.hasNextDouble() || s.hasNextInt()) {
                a++;
            } else {
                break;
            }
            sum += value;
        }
            if (a != 0) {
                System.out.println("Введено чисел: " + a);
                System.out.println("Сума введених чисел: " + sum);
                System.out.println("Середнє арифметичне введених чисел: " + sum / a);
            }
        }
    }
