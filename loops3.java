import java.util.Scanner;
public class loops3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,sum,rem;
        System.out.print("enter a number:");
        n=sc.nextInt();
        for(sum=0; n>0;n=n/10){
            rem=n%10;
            sum=sum+rem;
        }
        System.out.printf("sum of digit is %d",sum);    
    }
    
}