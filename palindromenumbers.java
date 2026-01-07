import java.util.Scanner;
public class palindromenumbers {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int r,temp;
        int sum=0;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("numbers is palindrome");
        }
        else{
            System.out.println("numbers is not palindrome");
        }
    }
    
}
