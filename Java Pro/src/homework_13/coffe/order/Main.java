package homework_13.coffe.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        System.out.println("Current orders:");
        board.draw();

        System.out.println("\nDelivering the next order:");
        board.deliver();
        board.draw();

        System.out.println("\nDelivering order number 33:");
        board.deliver(33);
        board.draw();

        System.out.println("\nDelivering order number 50 (non-existent):");
        board.deliver(50);
        board.draw();
    }
}
