package homework_5.task_05;

public class Car {
    public static void main(String[] args) {
        Car.start();
        }
        public static void start() {
            startCommand();
            startElectricity();
            startFuelSystem();
        }

        private static void startElectricity () {
            System.out.println("Start Electricity...");
        }
        private static void startCommand () {
            System.out.println("Start command...");
        }
        private static void startFuelSystem () {
            System.out.println("Start fuel system...");
        }
    }


