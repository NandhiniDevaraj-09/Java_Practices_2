import java.util.Scanner;

public class StringShifter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = s.nextLine();

        String encrypted = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); 
            char shiftedChar = (char) (c + 1); 
            encrypted += shiftedChar; 
        }

        System.out.println("Encrypted string: " + encrypted);

        s.close();
    }
}
