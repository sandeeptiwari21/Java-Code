import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n,arm=0,rem,c;
        System.out.println("Enter a number:");
        n=Sc.nextInt();
        c=n;
        
         while(n>0) {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
         }
         if(c==arm) {
            System.out.println("armstrong number");
         }
         else {
            System.out.println("Not a armstrong number");
         }
    }
}