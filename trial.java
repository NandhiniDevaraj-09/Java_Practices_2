import java.util.Scanner;
public class Trial {
public static void main(String[] args) {
  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
   System.out.print("Enter the array elements: ");
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
    System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
            

      
}
}
                    
       





