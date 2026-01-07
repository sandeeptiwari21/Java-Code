import java.util.Scanner;
public class fact1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,fact;
        System.out.print("enter the number:");
        n=sc.nextInt();
        for(fact=1;n>=1;n--){
            fact=fact*n;
        }
        System.out.printf("factorial is %d",fact);
    }
}