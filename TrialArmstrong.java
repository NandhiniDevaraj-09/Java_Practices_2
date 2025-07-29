class TrialArmstrong {
    public static void main(String[] args) {
        int n=27;
        int count=0;
        int temp=n;
        int tcount=temp;
        double sum=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        while(tcount!=0){
            int rem=tcount%10;
            sum+=Math.pow(rem,count);
            tcount/=10;
        }
        if(sum==n){
        System.out.println("I'm Armstrong");}
        else{
         System.out.println("I'm Not Armstrong");
        }
    }
}