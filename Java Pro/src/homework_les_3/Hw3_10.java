package homework_les_3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_10 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = s.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++){
                int value = (int) (Math.random() * 10);
                array[i] = value;
            }
            System.out.println("Получен массив со значениями" + Arrays.toString(array));

            int maxElement = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxElement) {
                    maxElement  = array[i];
                }
            }
            System.out.println("Минимальное значение массива: " + maxElement);


        }
    }

