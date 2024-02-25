package homework_14;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        // Приклад правильного масиву
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        // Приклад масиву з неправильною розмірністю
        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        // Приклад масиву з неправильними даними
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = calculator.doCalc(validArray);
            System.out.println("Sum: " + result);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            e.printStackTrace();
        }

        try {
            calculator.doCalc(invalidSizeArray);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            e.printStackTrace();
        }

        try {
            calculator.doCalc(invalidDataArray);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
