// Wap to print sum of all digits of a given number
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
    
}
