package homework_7.task_0;

import java.util.Scanner;

public class Box implements Area {
    private int a;
    private int b;
    public Box() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the side of the Box a: ");
        this.a = scanner.nextInt();
        System.out.print("enter the side of the Box b: ");
        this.b = scanner.nextInt();
    }
    @Override
    public void area() {
        int s = a * b;
        System.out.println("Area Box: " + s);
    }
    @Override
    public double calculateArea() {
        return a * b;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.area();
    }
}
