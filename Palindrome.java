class Palindrome {
    public static void main(String[] args) {
        int a=474;
        int digit=0;
        int reverse=0;
        int temp=a;
       while (a > 0) {
            digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }
         if(reverse==temp){
        System.out.println("Yes, It is a Palindrome");
        int nextPalindrome = temp + 1;
            while (true) {
                int num = nextPalindrome;
                int rev = 0;
                int original = num;
                
                while (num > 0) {
                    int d = num % 10;
                    rev = rev * 10 + d;
                    num = num / 10;
                }
                if (rev == original) {
                    System.out.println("\nThe next palindrome is " + nextPalindrome);
                    break;
                }
                nextPalindrome++;
            }
    }
    else{
        System.out.println("No, It is not a Palindrome");
    }
    
}
}