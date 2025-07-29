import java.util.Scanner;
public class positivePrime{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.print("enter a number: ");
   int n=sc.nextInt();
   int prime=0;
   int i;
   if(n<0){
    System.out.print("invalid input!");
   }else{
   for( i=2;i<n;i++){
      prime=n%i;
      }
     if(prime==0){
     System.out.print("The given positive number is prime");
     }else{
     System.out.print("The given positive number is not prime");
     }
}

}
}