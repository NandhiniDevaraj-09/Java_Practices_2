import java.util.Scanner;
public class TrySwapping{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any two numbers to swap:");
int a=sc.nextInt();
int b=sc.nextInt();
int temp =a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);

}
}