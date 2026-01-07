import java.util.*;
public class incresingdecreasingarray {
    public static void main(String[] args) {
        int nums[]={8,9,6,7,4,5,3,2,1};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++) {
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1; i>=n/2;i--) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
