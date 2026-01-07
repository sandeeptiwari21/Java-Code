//display the AP-1,3,5,7,9....upto 'n' terms
import java.util.Scanner;
public class loops19 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        for(int i=1;i<=2*n-1;i+=2)
        {
            System.out.print(i+" ");
        }
    }
    
}
