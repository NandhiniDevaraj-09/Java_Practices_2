import java.util.Scanner;

public class LongAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first long number (8 digits):");
        String num1 = scanner.next();
        
        System.out.println("Enter second long number (12 digits):");
        String num2 = scanner.next();

        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        int i = len1 - 1, j = len2 - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        System.out.println("Sum: " + result.reverse().toString());

        scanner.close();
    }
}
