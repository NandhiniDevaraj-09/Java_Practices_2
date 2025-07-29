import java.util.Scanner;
public class Reverse{
  public static void main(String[] args){
     Scanner sc = new Scanner( System.in);
      System.out.println("Enter the numbers:");
      int num = sc.nextInt();
      int reversed = 0;
      while(num!=0){
          int digit = num%10;
          reversed = reversed*10 + digit;
          num/= 10;
      }
      System.out.println("Reversed number:\t" + reversed);
      sc.close();
      }
}
     