import java.util.Scanner;

public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        sc.close();

        int maxSize = 1000000;
        String[] combinations = new String[maxSize];
        int count = 0;

        String[] stack = new String[maxSize];
        int[] indexStack = new int[maxSize];
        int top = 0;

        stack[top] = "";
        indexStack[top] = 0;
        top++;

        while (top > 0) {
            top--;
            String current = stack[top];
            int index = indexStack[top];

            if (index == digits.length()) {
                combinations[count] = current;
                count++;
                continue;
            }

            // One-digit mapping
            char ch1 = digits.charAt(index);
            if (ch1 != '0') {
                int oneDigit = ch1 - '0';
                if (oneDigit >= 1 && oneDigit <= 9) {
                    char letter = (char) ('a' + oneDigit - 1);
                    if (count < maxSize - 1) {
                        stack[top] = current + letter;
                        indexStack[top] = index + 1;
                        top++;
                    }
                }
            }

            // Two-digit mapping
            if (index + 1 < digits.length()) {
                int d1 = digits.charAt(index) - '0';
                int d2 = digits.charAt(index + 1) - '0';
                int twoDigit = d1 * 10 + d2;
                if (twoDigit >= 10 && twoDigit <= 26) {
                    char letter = (char) ('a' + twoDigit - 1);
                    if (count < maxSize - 1) {
                        stack[top] = current + letter;
                        indexStack[top] = index + 2;
                        top++;
                    }
                }
            }
        }

        // Manual lexicographic sort (bubble sort)
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (combinations[j].compareTo(combinations[j + 1]) > 0) {
                    String temp = combinations[j];
                    combinations[j] = combinations[j + 1];
                    combinations[j + 1] = temp;
                }
            }
        }

        // Print output
        for (int i = 0; i < count; i++) {
            System.out.println(combinations[i]);
        }
    }
}
