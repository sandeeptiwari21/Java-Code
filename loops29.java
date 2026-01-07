//write a program to print the power  of a raised to the power of b
import java.util.Scanner;
public class loops29 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the base valu a:");
        int a=Sc.nextInt();
        System.out.println("enter the exponient value:");
        int b=Sc.nextInt();
        long result =1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(a+"raised to the power of "+b+"is:"+result);
        Sc.close();
    }
    
}
