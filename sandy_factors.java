import java.util.Scanner;
public class sandy_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("enter the number:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        if(n%1==0){
            sum=sum+i;
        }
       }
       System.out.println("sum is"+sum);

    }
}
