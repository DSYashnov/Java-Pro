package homework_9;

public class Main {
    public static void main(String[] args) {
        DynamicStringCollection collection = new DynamicStringCollection();
        collection.add("Hello");
        collection.add("World");
        collection.add(1, "Dynamic");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

        collection.delete(1);
        System.out.println(collection.get(1));

        collection.delete("World");
        System.out.println(collection.isEmpty());
    }
}
