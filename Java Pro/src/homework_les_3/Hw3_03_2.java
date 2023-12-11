package homework_les_3;

public class Hw3_03_2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value  = Integer.parseInt(args[0]);
        int factorial = 1;
        int i = 1;

        while (i <= value){
            factorial *= i;
            i++;
        }
        System.out.println("Факториал " + value + "! = " + factorial);
    }

}


