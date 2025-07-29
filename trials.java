public class trials{
public static void main(String[] args){
int input = 1234;
int truedig = 0;
int output;
while(input != 0){
int dig = input % 10;
truedig = truedig*10 + dig;
input /= 10;
}
while(truedig != 0){
output = truedig % 10;
truedig /= 10;
if((output >= 1) && (output <= 26)){
char letter1 = (char)('a' + output - 1);
System.out.print(letter1);
}
}
System.out.println();
//count digit as double digits and find its respective alphabet 
while(truedig!=0){
output = truedig % 100;
truedig /= 100;
if((output >= 1) && (output <= 26)){
char letter2 = (char)('a' + output - 1);
System.out.print(letter2);
}else{
continue;
}
}
}
}