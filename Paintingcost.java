import java.util.Scanner;
public class Paintingcost {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int interior = 6;
int exterior = 3;
double[] in =new double[interior];
System.out.println("Enter the interior wall areas: ");
for(int i=0;i<interior;i++){
in[i]=sc.nextDouble();
}
double[] ex =new double[exterior];
System.out.println("Enter the exterior wall areas: ");
for(int i=0;i<exterior;i++){
ex[i]=sc.nextDouble();
}
double sumIn = 0;
double sumEx = 0;
for(int i=0;i<interior;i++){
sumIn += in[i]*18;
}
for(int i=0;i<exterior;i++){
sumEx += ex[i]*12;
}
System.out.println("The total cost of painting the walls is: " + (sumIn + sumEx));
}
}