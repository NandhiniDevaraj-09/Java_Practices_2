import java.util.Scanner;
class Pali_StrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence (chars, nums or symbols): ");
        String seq = sc.nextLine();
         String original = "Java";
        StringBuilder rev = new StringBuilder(seq);
        rev.reverse();  
        System.out.println("Reversed String: " + rev.toString());
        if (seq.equals(rev.toString())) {
            System.out.println("The input is a Palindrome.");
        } else {
            System.out.println("The input is not a Palindrome.");
        }
        sc.close();
    }
}