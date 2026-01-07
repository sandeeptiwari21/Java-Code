import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){//colms
            for(int j=1;j<=i;j++){//rows
                System.out.print(a+" ");
                a++;

            }
            System.out.println();
        }
    }
    
}
