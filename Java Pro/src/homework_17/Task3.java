package homework_17;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "Python", "c", "Code", "test");
        words.stream()
                .filter(word -> word.length() == 4 && word.equals(word.toLowerCase()))
                .forEach(System.out::println);
    }
    public static List<String> filterWord(List<String> strings) {
        return strings.stream()
                .filter(str -> str.length() == 4 && str.equals(str.toLowerCase()))
                .collect(Collectors.toList());
    }
}

