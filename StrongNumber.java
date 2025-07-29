import java.util.Scanner;
class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber+ " is a Strong Number.");
        } else {
            System.out.println(originalNumber+ " is NOT a Strong Number.");
        }
    }
}



class Main {
    public static void main(String[] args) {
        System.out.println("Strong Numbers between 1 and 1000 are:");

        for (int num = 1; num <= 1000; num++) {
            int n = num;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                int fact = 1;

                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }

                sum += fact;
                n /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

