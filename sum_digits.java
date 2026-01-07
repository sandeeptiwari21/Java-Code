import java.util.Scanner;
public class sum_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        int a=num;
        int sum=0;
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num/=10;
        }
        System.out.println("given digits:"+a);
        System.out.println("sum of digits:"+sum);


    }
    
}
