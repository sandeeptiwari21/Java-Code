import java.util.Scanner;
public class basics12 {
    public static void insertionsort(int arr[])
    {
        for(int i=0; i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        insertionsort(arr);
    }
    
}
