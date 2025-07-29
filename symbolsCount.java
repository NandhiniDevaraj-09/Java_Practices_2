import java.util.Scanner;
public class symbolsCount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in); 
String a = sc.nextLine();
int alen = a.length();
int count1=0;
int count2=0;
for(int i=0;i<alen;i++){
if(a.charAt(i)=='*'){
count1++;
}
else if(a.charAt(i)=='#'){
count2++;
}
}
if(count1>count2){
System.out.println(1);
}
else if(count1==count2){
System.out.println(0);
}
else{
System.out.println(-1);
}
sc.close();
}
}
