
 import java.util.Scanner;
 public class loops2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.printf("factoria is %d=%d",n,factorial);
    }
 }
