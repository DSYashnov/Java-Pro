package Homework_les_2;


public class Calc2 {
    /**
     * ������� �������� �������
    S = S? * (1 + W)tn
     */

    /**S � ��� ������� ���������
    S? � ���������� �����
    W � ��������� ������ (� ������ ����������� �����, ������ ������� �� 100)
    t � ����
    n � ������� ������ ��������� (� ������ ������� 1 ��� �� ��)
     */

/**
 * 3. ��������, ��� ������� ������������ ����������� ���� ��������� ������ � �������, ������� �����, �� ������� ����, ��������� ������ (����).
 * ������� ���������� ���� ������ �� ����� �� �� ��������� �������. (³������ ������ � ������������ �������)
 * � ������� 3 ����� ������� ����� ��������� ��������
 */
    public static  int pow(int year, int period) {
       return (int) Math.pow(year, period);
    }
    public static void main (String[]args) {
        if (args.length != 3) {
            System.out.println("������ ��� ���������: ");
        } else {
            double sum = Double.parseDouble(args[0]);
            double inter = Double.parseDouble(args[1]);
            int year = Integer.parseInt(args[2]);

            System.out.println("��� ��� ������: " + sum);
            System.out.println("�������� ����, ��� ������ �������� ����� " + year + " ����: " + sum * (1 + inter) * pow(year, 12));
        }
    }


}


