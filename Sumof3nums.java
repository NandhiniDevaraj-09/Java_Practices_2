public class Smallestof3nums{
   public static void main(String[]args){
      int num1,num2,num3,temp,result;
      num1=10;
      num2=20;
      num3=30;
      temp=num1>num2? num1:num2;
      result=temp>num1? temp:num1;
      System.out.print("The smallest of the 3 numbers is::"+result);
}
}