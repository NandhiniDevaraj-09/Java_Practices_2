import java.util.Scanner;
class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine(); 
        String modifiedWord = word.substring(1);
        int mid = modifiedWord.length() / 2;
        String firstPart = modifiedWord.substring(0, mid+1);
        String secondPart = modifiedWord.substring(mid);
        System.out.println(firstPart + " " + secondPart);
        sc.close();
    }
}
