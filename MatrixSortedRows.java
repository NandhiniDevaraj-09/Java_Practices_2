import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        System.out.println("Enter the array elements:");
        
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", a[i][j]); // Use printf for formatting matrix elements
            }
            System.out.println(); // Print a new line after each row
        }

        int asccount = 0;
        int desccount = 0;
        for (int i = 0; i < a.length; i++) {
            boolean ascsorted = true;
            boolean descsorted = true;
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] > a[i][j + 1]) {
                    ascsorted = false;
                }
                if (a[i][j] < a[i][j + 1]) {
                    descsorted = false;
                }
                if (!ascsorted && !descsorted) {
                    break;
                }
            }
            if (ascsorted) {
                asccount++;
            }
            if (descsorted) {
                desccount++;
            }
        }
        int sortedrows = asccount + desccount;
        System.out.println("The number of sorted rows is: " + sortedrows);
        
        sc.close(); 
    }
}
