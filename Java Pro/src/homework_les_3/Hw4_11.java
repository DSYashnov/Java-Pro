package homework_les_3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4_11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int value = (int) (Math.random() * 10);
            array[i] = value;
        }
        System.out.println("Получен массив со значениями" + Arrays.toString(array));

        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + minElement);

        int maxElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }

        }
        System.out.println("Минимальное значение массива: " + maxElement);
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("Массив после замены максимального и минимального элементов: " + Arrays.toString(array));
    }
}

