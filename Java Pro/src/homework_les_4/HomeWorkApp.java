package homework_les_4;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        amountWithin(15, 5);

        positiveOrNegativeInf(0);

        compareNumbers();

        positiveOrNegative(-1);

        printLine("Super", 5);

    }
    //Task_2
    public static void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple");
    }
    //Task_3
    public static void checkSumSign() {
        int a = -1;
        int b = -1;
        if (a + b >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }
    }
    //Task_4
    public static void printColor(){
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 & value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }

    }
    //Task_5
    public static void compareNumbers() {
        int a = -1;
        int b = 2;

        if(a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
    //Task_6
    public static void amountWithin(int a, int b) {
        System.out.println((a + b >= 10 && a + b <= 20) ? true : false);
    }
    //Task_7
    public static void positiveOrNegativeInf (int a) {
        if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }

    }
    //Task_8
    public static void positiveOrNegative (int a) {
        System.out.println((a < 0) ? true : false);
    }
    //Task_9
    public static void printLine(String s, int a){
        for (int i = 0; i < a; i++){
            System.out.println(s);
        }
    }


}
