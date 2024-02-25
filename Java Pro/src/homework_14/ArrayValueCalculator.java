package homework_14;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Array must be 4x4 in size");
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at [" + i + "][" + j + "]: " + array[i][j], e);
                }
            }
        }
        return sum;
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException(String message) {
            super(message);
        }
    }
    public static class ArrayDataException extends Exception {
        public ArrayDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
