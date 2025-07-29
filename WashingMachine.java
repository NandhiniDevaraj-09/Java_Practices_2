import java.util.Scanner;
public class WashingMachine{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int w = sc.nextInt();
if(w = 0){
System.out.println("Time Estimated:0 Minutes");
}
else if(w>0 && w<=2000){
System.out.println("Time Estimated:25 Minutes");
}
else if(w>=2001 && w<=4000){
System.out.println("Time Estimated:35 Minutes");
}
else if(w>=4000 && w<=7000){
System.out.println("Time Estimated:45 Minutes");
}
else if(w>7000){
System.out.println("Overloaded");
}
else{
System.out.println("Invalid Input"); 
}
}
}

