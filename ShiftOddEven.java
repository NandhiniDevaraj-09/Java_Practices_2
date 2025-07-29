import java.util.Scanner;
public class ShiftOddEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
if(((n>>1)<<1)==n){
System.out.println("The given number is Even");
}
else{
System.out.println("The given number is Odd");
}
}
}
