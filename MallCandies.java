import java.util.Scanner;
public class MallCandies{
public static void main(String[] args){
int cap = 10;
int jar = 7;
int min = 5;
Scanner sc = new Scanner(System.in);
int req = sc.nextInt();

if (req <= 0 || req > jar){
System.out.println("Invalid input");
System.out.println("No of Candies Left: "+jar);
}


else{
jar -= req;
System.out.println("No of Candies Sold: " + req);

if(jar <= cap){
jar = cap;  
}

System.out.println("No of Candies Left: "+jar);
}


sc.close();
}
}
