package homework_3;

public class Hw3_02 {
    // Дано число n за допомогою циклу for порахувати факторіал n!
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value  = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= value; ++i) {
            factorial *= i;
        }
        System.out.println("Факториал " + value + "! = " + factorial);
    }
}
