package homework_10;

public class Main {
    public static void main(String[] args) {
        DynamicStringCollection collection = new DynamicStringCollection();
        collection.add("Hello");
        collection.add("World");
        collection.add(1, "Dynamic");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

        collection.delete("Dynamic");
        System.out.println(collection.get(1));

        System.out.println(collection.contain("World"));
        System.out.println(collection.contain("Dynamic"));

        collection.clear();
        System.out.println(collection.size());

        DynamicStringCollection collection2 = new DynamicStringCollection();
        collection2.add("Hello");
        collection2.add("World");
        System.out.println(collection.equals(collection2));

        collection.add("Hello");
        collection.add("World");
        System.out.println(collection.equals(collection2));
    }
}


