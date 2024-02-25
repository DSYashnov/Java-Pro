package homework_7.task_0;

import java.util.Scanner;

public class Arrays implements Area {
    private double totalArea;
    public Arrays() {
        System.out.print("Enter length array: ");
    }
    @Override
    public void area() {
        Scanner scanner = new Scanner(System.in);
        int valueMass = scanner.nextInt();
        Area[] arr = new Area[valueMass];
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 3);

            switch (rand) {
                case 0:
                    Box box = new Box();
                    box.area();
                    totalArea += box.calculateArea();
                    break;
                case 1:
                    Circle circle = new Circle();
                    circle.area();
                    totalArea += circle.calculateArea();
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    triangle.area();
                    totalArea += triangle.calculateArea();
                    break;
            }
        }
        System.out.println("Total Area: " + totalArea);
    }
    @Override
    public double calculateArea() {
        return totalArea;
    }
    public static void main (String[]args){
                Arrays arrays = new Arrays();
                arrays.area();
            }
        }


