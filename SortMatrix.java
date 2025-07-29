import java.util.Scanner;
public class SortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] m = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                m[i][j] = sc.nextInt();
            }
        }
        sort(m, rows, cols);
        System.out.println("Sorted Matrix:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    static void sort(int[][] m, int rows, int cols) {
        for (int i = 0; i < rows * cols - 1; i++) {
            for (int j = i + 1; j < rows * cols; j++) {
                int row1 = i / cols, col1 = i % cols;
                int row2 = j / cols, col2 = j % cols;
                if (m[row1][col1] > m[row2][col2]) {
                    int temp = m[row1][col1];
                    m[row1][col1] = m[row2][col2];
                    m[row2][col2] = temp;
                }
            }
        }
    }
}