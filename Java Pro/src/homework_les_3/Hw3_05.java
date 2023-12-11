package homework_les_3;

public class Hw3_05 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);

        double res = 1.0;

        for (int i = 0; i < n; ++i) {
            res *= x;
        }
        System.out.println(x + " в степени " + n + " равняется " + res);
    }
}
