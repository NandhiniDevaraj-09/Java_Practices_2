import java.util.Scanner;

public class MonkeyLeftOnTree1{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.print("Enter no.of Monkeys: ");
int n=sc.nextInt();

System.out.print("Enter no.of eatable bananas: ");
int k=sc.nextInt();

System.out.print("Enter no.of eatable peanuts: ");
int j=sc.nextInt();

System.out.print("Enter total bananas: ");
int m=sc.nextInt();

System.out.print("Enter total peanuts: ");
int p=sc.nextInt();

if (n <= 0) {
    System.out.println("Invalid input! Number of monkeys must be greater than zero.");
       return;
}
        
if (k < 0 || j < 0 || m < 0 || p < 0) {
    System.out.println("Invalid input! Negative values are not allowed.");
       return;
}

int div1 = m/k;
int div2 = p/j;
int sum = div1 + div2;
int MonkeysLeft = n-sum;

System.out.print("the no.of Monkeys left on the tree are: "+MonkeysLeft);
}
}

/*import java.util.Scanner;

public class MonkeyLeftOnTree1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.of Monkeys: ");
        int n = sc.nextInt();

        System.out.print("Enter no.of eatable bananas: ");
        int k = sc.nextInt();

        System.out.print("Enter no.of eatable peanuts: ");
        int j = sc.nextInt();

        System.out.print("Enter total bananas: ");
        int m = sc.nextInt();

        System.out.print("Enter total peanuts: ");
        int p = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of monkeys must be greater than zero.");
            return;
        }

        if (k <=0  || j <=0  || m < 0 || p < 0) {
            System.out.println("Invalid input! Negative values are not allowed.");
            return;
        }
      
        int div1 = m / k;
        int div2 = p / j;
        int sum = div1 + div2;
        int MonkeysLeft = n - sum;

        while (MonkeysLeft < 0) {
            MonkeysLeft++;
        }

        System.out.print("The no.of Monkeys left on the tree are: " + MonkeysLeft);
    }
}*/


/*import java.util.Scanner;

public class MonkeyLeftOnTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of Monkeys: ");
        int n = sc.nextInt();

        System.out.print("Enter no. of eatable bananas per monkey: ");
        int k = sc.nextInt();

        System.out.print("Enter no. of eatable peanuts per monkey: ");
        int j = sc.nextInt();

        System.out.print("Enter total bananas: ");
        int m = sc.nextInt();

        System.out.print("Enter total peanuts: ");
        int p = sc.nextInt();

        // Validation checks
        if (n <= 0) {
            System.out.println("Invalid input! Number of monkeys must be greater than zero.");
            sc.close();
            return;
        }

        if (k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("Invalid input! Negative values are not allowed.");
            sc.close();
            return;
        }

        // Calculate the number of monkeys that can eat
        int bananaEatingMonkeys = m / k;
        int peanutEatingMonkeys = p / j;

        // Find the total number of monkeys that got food
        int fedMonkeys;
        if (bananaEatingMonkeys + peanutEatingMonkeys > n) {
            fedMonkeys = n;  // If more food than monkeys, all monkeys eat
        } else {
            fedMonkeys = bananaEatingMonkeys + peanutEatingMonkeys;
        }

        // Calculate monkeys left
        int monkeysLeft = n - fedMonkeys;

        System.out.println("The number of monkeys left on the tree: " + monkeysLeft);

        // Close scanner
        sc.close();
    }
}*/


