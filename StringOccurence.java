import java.util.Scanner;
public class StringOccurence {
   public static void main(String[] args) {
   Scanner s =new Scanner(System.in);
      String a = s.nextLine();
      String b = s.nextLine();
      int count = 0;
      int sum = 0;
      char[] main = a.toCharArray();
      char[] sub = b.toCharArray();
for(int i=0;i<main.length;i++){
for(int j=0;j<sub.length;j++){
if(sub[j]==main[i]){
count++;
}
}
}
System.out.print(count);
}
}
