import java.util.Scanner;

public class HexadecimalAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter first hexadecimal number: ");
        String a = sc.next().toUpperCase();       
        System.out.print("Enter second hexadecimal number: ");
        String b = sc.next().toUpperCase();        
        sc.close();

        while (a.length() > b.length()) {
            b = '0' + b;
        }
        while (b.length() > a.length()) {
            a = '0' + a;
        }

        String result = "";
        int carry = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int n, m;

            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                n = a.charAt(i) - '0';
            } else {
                n = a.charAt(i) - 'A' + 10;
            }

            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                m = b.charAt(i) - '0';
            } else {
                m = b.charAt(i) - 'A' + 10;
            }

            int sum = n + m + carry;
            int rem = sum % 16;
            carry = sum / 16;

            if (rem < 10) {
                result = (char) (rem + '0') + result;
            } else {
                result = (char) (rem - 10 + 'A') + result;
            }
        }

        if (carry != 0) {
            if (carry < 10) {
                result = (char) (carry + '0') + result;
            } else {
                result = (char) (carry - 10 + 'A') + result;
            }
        }

        System.out.print("Sum: " + result);
    }
}