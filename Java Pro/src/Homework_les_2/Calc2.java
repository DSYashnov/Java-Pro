package Homework_les_2;


public class Calc2 {
    /**
     * ‘ормула складних в≥дсотк≥в
    S = S? * (1 + W)tn
     */

    /**S Ц наш к≥нцевий результат
    S? Ц початковий вклад
    W Ц в≥дсоткова ставка (у вигл€д≥ дес€ткового дробу, ставка под≥лена на 100)
    t Ц роки
    n Ц к≥льк≥сть пер≥од≥в складанн€ (в нашому випадку 1 раз на р≥к)
     */

/**
 * 3. ѕрограму, €ка пропонуЇ користувачев≥ запровадити суму грошового вкладу у гривн€х, в≥дсоток р≥чних, €к≥ виплачуЇ банк, тривал≥сть вкладу (рок≥в).
 * ¬ивести накопичену суму грошей за кожен р≥к та нарахован≥ в≥дсотки. (¬≥дсотки складн≥ з кап≥тал≥зац≥Їю щом≥с€ц€)
 * ” завданн≥ 3 числа вводити через аргументи програми
 */
    public static  int pow(int year, int period) {
       return (int) Math.pow(year, period);
    }
    public static void main (String[]args) {
        if (args.length != 3) {
            System.out.println("¬вед≥ть три аргументи: ");
        } else {
            double sum = Double.parseDouble(args[0]);
            double inter = Double.parseDouble(args[1]);
            int year = Integer.parseInt(args[2]);

            System.out.println("ѕри сум≥ вкладу: " + sum);
            System.out.println("«агальна сума, €ку отримаЇ вкладник через " + year + " рок≥в: " + sum * (1 + inter) * pow(year, 12));
        }
    }


}


