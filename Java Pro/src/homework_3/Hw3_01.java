package homework_3;

public class Hw3_01 {
    /**
     * За допомогою циклу for вивести на екран непарні числа від 1 до 99.
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println(i + 1);
            }
        }
    }
}

