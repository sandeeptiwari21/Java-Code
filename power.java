import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base number:");
        int base=sc.nextInt();
        System.out.print("enter the power number:");
        int power=sc.nextInt();
        int result=1;
        for(int i=1; i<=power;i++)
        {
            result*=base;
        }
        System.out.println("result:"+result);
    }
    
}
