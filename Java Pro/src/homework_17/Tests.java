package homework_17;

import java.util.List;

public class Tests {

    @Test
    public void testAverage() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double expected = 3.0;
        assertEquals(expected, Task1.calculateAverage(numbers), 0.001);
    }

    @Test
    public void testUpperCasePairs() {
        List<String> strings = List.of("one", "two", "three");
        List<Pair<String, String>> expectedPairs = List.of(
                new Pair<>("one", "ONE"),
                new Pair<>("two", "TWO"),
                new Pair<>("three", "THREE")
        );
        assertEquals(expectedPairs, Task1.transformToUpperCasePairs(strings));
    }
    @Test
    public void testFilteredWords() {
        List<String> words = List.of("java", "Python", "c", "Code", "test");
        List<String> expectedFilteredWords = List.of("java", "test");
        assertEquals(expectedFilteredWords, Task1.filterWord(words));
    }
}

