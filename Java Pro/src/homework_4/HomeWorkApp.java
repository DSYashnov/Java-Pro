package homework_4;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter task number(2-10) : ");

        int taskNumber = s.nextInt();

        if (taskNumber >= 2 && taskNumber <= 10) {
            System.out.println("Task number " + taskNumber);
        } else {
            System.out.println("Incorrect task number\nplease repeat");
        }
        switch (taskNumber) {
            case 2 -> printThreeWords(); //Task_2
            case 3 -> checkSumSign(); //Task_3
            case 4 -> printColor(); //Task_4
            case 5 -> compareNumbers(); //Task_5
            case 6 -> amountWithin(15, 6); //Task_6
            case 7 -> positiveOrNegativeInf(0); //Task_7
            case 8 -> positiveOrNegative(-1); //Task_8
            case 9 -> printLine("Super", 5); //Task_9
            case 10 -> yearNow(2023); //Task_10
        }
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
    public static void printColor() {
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

        if (a >= b) {
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
    public static void positiveOrNegativeInf(int a) {
        if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    //Task_8
    public static void positiveOrNegative(int a) {
        System.out.println((a < 0) ? true : false);
    }

    //Task_9
    public static void printLine(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    //Task_10
    public static void yearNow(int y) {
        boolean result = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        System.out.println(result);
    }
}


