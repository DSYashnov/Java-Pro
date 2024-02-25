package homework_7.task_0;

import java.util.Scanner;

public class Circle implements Area {
        private int rad;
    public Circle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        this.rad = scanner.nextInt();
    }
    @Override
    public void area() {
        double s = ((rad * rad) * 3.14);
        System.out.println("Area Circle: " + s);
    }
    @Override
    public double calculateArea() {
        return ((rad * rad) * 3.14);
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}


