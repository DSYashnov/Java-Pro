package Homework_les_2;
import java.util.Scanner;

public class Calc1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        double sum = 0;
        while (true) {
            double value = s.nextDouble();
            //���� ����� �� �����, �� ���� �������� ��������� � ���� ������ ����������� �������� �������� �����
            if (s.hasNextDouble() || s.hasNextInt()) {
                a++;
            } else {
                break;
            }
            sum += value;
        }
            if (a != 0) {
                System.out.println("������� �����: " + a);
                System.out.println("���� �������� �����: " + sum);
                System.out.println("������ ����������� �������� �����: " + sum / a);
            }
        }
    }




