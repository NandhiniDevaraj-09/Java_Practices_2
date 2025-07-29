import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        boolean found=false;
        int m = s.nextInt();
        int[] b = new int[m];
        
        for (int j = 0; j < m; j++) {
            b[j] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
               if(b[j]==a[i]){
                   System.out.print("true");
               }else{
                   System.out.print("false");
               }
          }
        }
     }
}