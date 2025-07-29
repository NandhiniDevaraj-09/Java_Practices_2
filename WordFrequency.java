import java.util.Scanner;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        String[] words = input.toLowerCase().split("\\s+");
        int[] count = new int[words.length];
        boolean[] counted = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) {
                count[i] = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count[i]++;
                        counted[j] = true;
                    }
                }
            }
        }
        System.out.println("Word frequencies:");
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}