import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=Sc.nextInt();
        System.out.println("enter the second number:");
        int b=Sc.nextInt();
         int ans=(a>b)? a:b;

         while(true){
            if(ans % a==0 && ans % b==0)
            break;
            ans++;
         }
         System.out.println("lcm of"+a+"and"+b+":"+ans);
    }
    
}
