package homework_3;

public class Hw3_06 {

        public static void main(String[] args) {
            int initialNumber = 0;
            int sequenceSize = 10;
            for (int i = 0; i < sequenceSize; ++i) {
                int currentNumber = initialNumber - 5 * i;
                System.out.println(currentNumber);
            }
        }
    }


