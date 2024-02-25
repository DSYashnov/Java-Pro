package homework_17;

import javafx.util.Pair;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three");
        List<Pair<String, String>> upperCasePairs = strings.stream()
                .map(s -> new Pair<>(s, s.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println("Pairs: " + upperCasePairs);
    }
    public static List<Pair<String, String>> transformToUpperCasePairs(List<String> strings) {
        return strings.stream()
                .map(str -> new Pair<>(str, str.toUpperCase()))
                .collect(Collectors.toList());
    }
}

