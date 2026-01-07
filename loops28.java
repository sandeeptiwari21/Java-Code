//write a program to print the sum of all factors of a number
import java.util.Scanner;
public class loops28 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.printf("sum of factors=%d",sum);
        Sc.close();

    }
    
}
