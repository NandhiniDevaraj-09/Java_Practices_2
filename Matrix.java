public class Matrix{
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int k = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}
