package homework_11.task1_4;

import java.util.*;

public class Task1_4 {
    // Завдання 1: countOccurance
    public static int countOccurance(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    // Завдання 2: toList
    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    // Завдання 3: findUnique
    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }

    // Завдання 4: calcOccurance
    public static void calcOccurance(List<String> list) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String s : list) {
            occuranceMap.put(s, occuranceMap.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occuranceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Завдання 5: findOccurance
    public static List<WordOccurrence> findOccurance(List<String> list) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String s : list) {
            occuranceMap.put(s, occuranceMap.getOrDefault(s, 0) + 1);
        }
        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occuranceMap.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
