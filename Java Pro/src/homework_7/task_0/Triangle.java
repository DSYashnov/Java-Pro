package homework_7.task_0;

import java.util.Scanner;

public class Triangle implements Area {
    private int a;
    private int b;
    private  int c;
    public Triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of Triangle a: ");
        this.a = scanner.nextInt();
        System.out.print("Enter the value of Triangle b: ");
        this.b = scanner.nextInt();
        System.out.print("Enter the value of Triangle c: ");
        this.c = scanner.nextInt();
    }
    @Override
    public void area() {
        double p = ((a+b+c)/2);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area Triangle: " + s);
    }

    @Override
    public double calculateArea() {
        double p = ((a+b+c)/2);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
    }
}

