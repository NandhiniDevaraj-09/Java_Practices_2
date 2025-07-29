import java.util.Scanner;
class reverseintegerSolution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
                        if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) 
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) 
                return 0;  
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();       
        Solution solution = new Solution();
        int reversed = solution.reverse(num);    
        System.out.println("Reversed number: " + reversed);
    }
}