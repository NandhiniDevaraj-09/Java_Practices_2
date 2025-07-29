import java.util.Scanner;
class Pali_NoBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence (chars, nums or symbols): ");
        String seq = sc.nextLine();
        String rev = "";
        for (int i = seq.length() - 1; i >= 0; i--) {
            rev += seq.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
        boolean isPalindrome = true;
        if (seq.length() == rev.length()) { 
            for (int i = 0; i < seq.length(); i++) {
                if (seq.charAt(i) != rev.charAt(i)) {
                    isPalindrome = false;
                    break;
                }
            }
        } else {
            isPalindrome = false;
        }
        if (isPalindrome) {
            System.out.println("The input is a Palindrome.");
        } else {
            System.out.println("The input is not a Palindrome.");
        }
        sc.close();
    }
}
