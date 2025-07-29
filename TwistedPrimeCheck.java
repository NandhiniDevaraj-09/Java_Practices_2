public class TwistedPrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n) { 
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void checkTwistedPrime(int n) {
        if (isPrime(n)) { 
            int reversed = 0;
            int original = n; 
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }

            System.out.println("Original number:\t" + original);
            System.out.println("Reversed number:\t" + reversed);

            if (isPrime(reversed)) {
                System.out.println(original + " is a Twisted Prime number.");
            } else {
                System.out.println(original + " is not a Twisted Prime number.");
            }
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        int num= 37; 
        checkTwistedPrime(num);
    }
}