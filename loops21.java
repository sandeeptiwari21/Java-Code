//wap to find the highest factor of a number 'n'(other than n itself)
import java.util.Scanner;
public class loops21 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0)
            System.out.println(i);
        }
    }
    
}
