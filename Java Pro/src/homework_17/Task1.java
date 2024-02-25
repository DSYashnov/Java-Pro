package homework_17;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}

