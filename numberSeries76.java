public class numberSeries76 {
    public static void main(String[] args) {
        int[] n=new int[15];
        n[0]=0;
        n[1]=0;
        int a=n.length;
        for(int i=2;i<a;i++){
          n[i]=7*(i/2);
            if(i+1<15){
                n[i+1]=6*(i/2);
             }
        }
     System.out.print(n[a-1]);
   }
}           
           
        