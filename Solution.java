import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();    
        if (isAnagram(s1, s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }     
        sc.close();
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}