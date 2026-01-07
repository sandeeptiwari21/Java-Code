import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,fact;
        System.out.println("enter the number:");
        n=sc.nextInt();
        for(fact=1;n>=1;n--)
        {
            fact=fact*n;
        }
        System.out.printf("enter the factorial %d",fact);
    }
}

