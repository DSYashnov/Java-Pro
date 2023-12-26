package homework_2;

public class Hw2_03 {
    /**
     * Формула складних відсотків
    S = S1 * (1 + W)tn
     */

    /**
     S – наш кінцевий результат
     S1 – початковий вклад
     W – відсоткова ставка (у вигляді десяткового дробу, ставка поділена на 100)
     t – роки
     n – кількість періодів складання (в нашому випадку 1 раз на рік)
     */

    public static void main (String[]args) {
        if (args.length != 3) {
            System.out.println("Введіть три аргументи: ");
        } else {
            double sum = Double.parseDouble(args[0]); //сума вкладу
            double inter = Double.parseDouble(args[1]); //процентна ставка
            int year = Integer.parseInt(args[2]);//кількість років
            int month = 12 * year;
            int round = 0;
            String s;

            for (int i = 1; i <= year; i++) {
                round++;
                if (round == 1){
                    s = "рік";
                } else if (round > 1 & round <= 4){
                    s = "роки";
                } else {
                    s = "років";
                }
                System.out.print(sum * Math.pow(1 + inter/month, month * i) + " грн.");
                System.out.println(" отримано за " + round + " " + s);
            }

        }
    }
}
