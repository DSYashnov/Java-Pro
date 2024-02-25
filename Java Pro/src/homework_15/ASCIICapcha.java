package homework_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ASCIICapcha {
    private static final Map<Character, String[]> digitMap = new HashMap<>();

    static {
        digitMap.put('0', new String[]{
                "@@@@@@",
                "@@  @@",
                "@@  @@",
                "@@  @@",
                "@@@@@@"
        });
        digitMap.put('1', new String[]{
                "   @@",
                "  @@@",
                "   @@",
                "   @@",
                " @@@@"
        });
        digitMap.put('2', new String[]{
                "@@@@@",
                "    @@",
                "@@@@@",
                "@@",
                "@@@@@@"
        });
        digitMap.put('3', new String[]{
                "@@@@@@",
                "    @@",
                " @@@@@",
                "    @@",
                "@@@@@@"
        });
        digitMap.put('4', new String[]{
                "@@  @@",
                "@@  @@",
                "@@@@@@",
                "    @@",
                "    @@"
        });
        digitMap.put('5', new String[]{
                "@@@@@@",
                "@@",
                "@@@@@@",
                "    @@",
                "@@@@@@"
        });
        digitMap.put('6', new String[]{
                "@@@@@@",
                "@@",
                "@@@@@@",
                "@@  @@",
                "@@@@@@"
        });
        digitMap.put('7', new String[]{
                "@@@@@@",
                "   @@",
                "  @@",
                " @@",
                "@@"
        });
        digitMap.put('8', new String[]{
                "@@@@@@",
                "@@  @@",
                "@@@@@@",
                "@@  @@",
                "@@@@@@"
        });
        digitMap.put('9', new String[]{
                "@@@@@@",
                "@@  @@",
                "@@@@@@",
                "    @@",
                "@@@@@@"
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sequence of digits: ");
        String input = scanner.nextLine();

        if (!input.matches("\\d+")) {
            System.out.println("Input should only contain digits.");
            return;
        }

        printASCIICaptcha(input);
    }

    private static void printASCIICaptcha(String input) {
        StringBuilder[] rows = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            rows[i] = new StringBuilder();
        }

        for (char digit : input.toCharArray()) {
            String[] asciiDigit = digitMap.get(digit);
            for (int i = 0; i < 5; i++) {
                rows[i].append(asciiDigit[i]).append("           ");
            }
        }

        for (StringBuilder row : rows) {
            System.out.println(row.toString());
        }
    }
}
