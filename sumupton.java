import java.util.Scanner;
public class sumupton {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a numbers:");
        int n= Sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=1;j<=n;j++){
                p*=j;
            }
            sum+=p;
        }
        System.out.println("sum="+sum);
    }
    
}
