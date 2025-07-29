import java.util.Arrays;
class RevArray {
    public static void main(String[] args) {
        int[] a ={10,20,30,45,8};
        Arrays.sort(a);
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        System.out.println(a[i]);
        
    }
}
