import java.util.Scanner;
class Pali_Built-in_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence (chars, nums or symbols): ");
        String seq = sc.nextLine();
        String rev = "";
        int len = seq.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += seq.charAt(i);
        }
        System.out.println("Reversed Sequence: " + rev);
        if (seq.equals(rev)) {
            System.out.println("The input is a Palindrome.");
        } else {
            System.out.println("The input is not a Palindrome.");
        }
        sc.close();
    }
}