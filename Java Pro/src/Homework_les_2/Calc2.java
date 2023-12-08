package Homework_les_2;

public class Calc2 {
    /**
     * ‘ормула складних в≥дсотк≥в
    S = S1 * (1 + W)tn
     */

    /**
     S Ц наш к≥нцевий результат
     S1 Ц початковий вклад
     W Ц в≥дсоткова ставка (у вигл€д≥ дес€ткового дробу, ставка под≥лена на 100)
     t Ц роки
     n Ц к≥льк≥сть пер≥од≥в складанн€ (в нашому випадку 1 раз на р≥к)
     */

//    public static  double pow(double year, double period) {
//       return (int) Math.pow(year, period);

    public static void main (String[]args) {
        if (args.length != 3) {
            System.out.println("¬вед≥ть три аргументи: ");
        } else {
            double sum = Double.parseDouble(args[0]); //сума вкладу
            double inter = Double.parseDouble(args[1]); //процентна ставка
            int year = Integer.parseInt(args[2]);//к≥льк≥сть рок≥в
            int month = 12 * year;
            int round = 0;
            String s;

            for (int i = 1; i <= year; i++) {
                round++;
                if (round == 1){
                    s = "р≥к";
                } else if (round > 1 & round <= 4){
                    s = "роки";
                } else {
                    s = "рок≥в";
                }
                System.out.print(sum * Math.pow(1 + inter/month, month * i) + " грн.");
                System.out.println(" отримано за " + round + " " + s);
            }

        }
    }


}


