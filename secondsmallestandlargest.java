import java.util.*;
public class secondsmallestandlargest {
    public static void main(String[] args) {
        int arr[]={6,2,7,3,5};
        int temp,size;
        size=arr.length;
        System.out.println("array size is :" +size);
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]  > arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
       // System.out.println();
        System.out.println("element of array is ascending order:-");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]+ " ");
        }
       // System.out.println();
        System.out.println("second largest number is : " +arr[size-2]);
        //System.out.println("third largest number is : " +arr[size-3]);
        
    }
}
   