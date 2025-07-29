import java.util.Scanner;
public class GoodNumber {
  public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int temp=n;
     int rem;
     int sum =0;
     while(n!=0){
       rem=n%10;
       sum+=rem;
       n/=10;
    }
    if(temp%sum==0){
     System.out.print("It is a good number");
    }else{
       System.out.print("It is a bad number");
    }
  }
}