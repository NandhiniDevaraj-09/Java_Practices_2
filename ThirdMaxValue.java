import java.util.Scanner;

public class ThirdMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the no.of cols:");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int firstMax = arr[0][0];
        int secondMax = arr[0][0];
        int thirdMax = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > firstMax) {
                    firstMax = arr[i][j];
                }
            }
        }
        boolean secondExists = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < firstMax) {
                    if (!secondExists || arr[i][j] > secondMax) {
                        secondMax = arr[i][j];
                        secondExists = true;
                    }
                }
            }
        }
        boolean thirdExists = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < secondMax) {
                    if (!thirdExists || arr[i][j] > thirdMax) {
                        thirdMax = arr[i][j];
                        thirdExists = true;
                    }
                }
            }
        }
        if (!thirdExists) {
            System.out.println("3rd maximum does not exist");
        } else {
            System.out.println("The 3rd maximum value is: " + thirdMax);
        }
        scanner.close();
    }
}