import java.util.Scanner;
public class Harshadnumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=Sc.nextInt();
        int rem=0,sum=0,n;
        n=number;
        while(number>0){
            rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        if(n%sum==0){
            System.out.println(n+"is harshad number");
        }
        else{
            System.out.println(n+"is not harshad number");
        }
    }
    
}
