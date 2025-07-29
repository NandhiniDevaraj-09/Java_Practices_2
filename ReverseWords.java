import java.util.Scanner;
class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input=sc.nextLine();
        String rev="";
        String word="";
        int i=input.length()-1;
        while (i>=0) {
            if (input.charAt(i) != ' ') {
                word =input.charAt(i)+word;
            } else {
                if (!word.isEmpty()) {
                    rev=rev+word+ " ";
                    word ="";
                }
            }
            i--;
        }
        if (!word.isEmpty()) {
            rev =rev+word;
        }
        System.out.println("Reversed sentence: "+rev);
        sc.close();
    }
}
