import java.util.*;
public class pairsinsubarray {
    public static void printsubarray(int numbers[]) {
        for(int i=0;i<numbers.length;i++) {
            int start=numbers[i];
            for(int j=i;j<numbers.length;j++) {
                int end=numbers[j];
                for(int k=start;k<=end;k++) {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        printsubarray(nums);
        
    }
    
}
