package Homework_les_2;

public class Calc2 {
    /**
     * ������� �������� �������
    S = S1 * (1 + W)tn
     */

    /**
     S � ��� ������� ���������
     S1 � ���������� �����
     W � ��������� ������ (� ������ ����������� �����, ������ ������� �� 100)
     t � ����
     n � ������� ������ ��������� (� ������ ������� 1 ��� �� ��)
     */

//    public static  double pow(double year, double period) {
//       return (int) Math.pow(year, period);

    public static void main (String[]args) {
        if (args.length != 3) {
            System.out.println("������ ��� ���������: ");
        } else {
            double sum = Double.parseDouble(args[0]); //���� ������
            double inter = Double.parseDouble(args[1]); //��������� ������
            int year = Integer.parseInt(args[2]);//������� ����
            int month = 12 * year;
            int round = 0;
            String s;

            for (int i = 1; i <= year; i++) {
                round++;
                if (round == 1){
                    s = "��";
                } else if (round > 1 & round <= 4){
                    s = "����";
                } else {
                    s = "����";
                }
                System.out.print(sum * Math.pow(1 + inter/month, month * i) + " ���.");
                System.out.println(" �������� �� " + round + " " + s);
            }

        }
    }


}


