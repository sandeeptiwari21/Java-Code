import java.util.Scanner;
public class loops27{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=Sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("enter number"+i+":");
            double number=Sc.nextDouble();
            sum+=number;
        }
        double average=sum/n;
        System.out.println("su m is"+sum);
        System.out.println("average is"+average);
        Sc.close();
    }
}
