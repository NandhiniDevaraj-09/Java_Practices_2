import java.util.Scanner;
class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        String s = sc.nextLine();
        String sb1= sc.nextLine();
        String sb2= sc.nextLine();
        String result=s.replace(sb1,sb2);
        System.out.print(result);
        }    
    }
