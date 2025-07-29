class Main {
    public static void main(String[] args) {
        int[] a ={10,20,30,45,8};
        int max=0;
        int s=0;
        int t=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max)
            {
                max =a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>s && a[i]!=max)
            
            {
                s =a[i];
            }
        }
                for (int i = 0; i < a.length; i++) {
            if(a[i]>t && a[i]!=s && a[i]!=max)
            
            {
                t =a[i];
            }
        }
        System.out.println(t);
        
    }
}
