import java.util.*;
public class smallestarray {
    public static int getsmallest(int numbers[]) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++) {
            if(smallest > numbers[i]) {
                smallest=numbers[i];
            }
            if(largest < numbers[i]) {
                largest=numbers[i];
            }
        }
        System.out.println("getlargest number is :" +largest);
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        System.out.println("getsmallest numbers is :" +getsmallest(numbers));
    }

}
   
