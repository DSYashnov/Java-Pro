package homework_11.task1_4;

import java.util.Arrays;
import java.util.List;

import static homework_11.task1_4.Task1_4.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        int count = countOccurance(stringList, "apple");
        System.out.println("Кількість 'apple': " + count);

        int[] array = {1, 2, 3, 4, 5};
        List<Integer> integerList = toList(array);
        System.out.println("Масив у список: " + integerList);

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("Унікальні числа: " + uniqueNumbers);

        calcOccurance(stringList);

        List<WordOccurrence> occurrences = findOccurance(stringList);
        System.out.println("Повторення слів: " + occurrences);
    }
}
