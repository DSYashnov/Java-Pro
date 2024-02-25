package homework_12;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("files.txt", 500, "/path/to/file");
        FileData file2 = new FileData("firstApp.java", 1500, "/path/to/file");
        FileData file3 = new FileData("readme.md", 200, "/path/to/docs");

        navigator.add("/path/to/file", file1);
        navigator.add("/path/to/file", file2);
        navigator.add("/path/to/docs", file3);

        System.out.println("Find /path/to/file: " + navigator.find("/path/to/file"));
        System.out.println("Filter by size <= 1000: " + navigator.filterBySize(1000));
        System.out.println("All files sorted by size: " + navigator.sortBySize());

        navigator.remove("/path/to/file");
        System.out.println("After removing /path/to/file: " + navigator.find("/path/to/file"));

        // Перевірка консистентності
        FileData file4 = new FileData("wrongPath.txt", 100, "/another/path");
        navigator.add("/path/to/file", file4);  // Виведе помилку
    }
}
