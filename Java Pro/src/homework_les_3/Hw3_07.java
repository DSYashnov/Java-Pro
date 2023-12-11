package homework_les_3;

import java.util.Scanner;

public class Hw3_07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        int count = 0;
        System.out.println("Таблица умножения на: " + num);
        for (int i = 1; i <= 10; i++){
            double res = num * i;
            count++;
            System.out.println(num + " * " + count + " = " + res);
        }

    }

}
