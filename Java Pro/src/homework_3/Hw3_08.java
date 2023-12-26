package homework_3;

import java.util.Arrays;

public class Hw3_08 {
    public static void main(String[] args) {
        int[] noTwo = new int[10];
        for (int i = 0, num = 1; i < 10; i++, num += 2) {
            noTwo[i] = num;
        }
            System.out.print(Arrays.toString(noTwo));
        }
    }

