import java .util.Scanner;
public class loop8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elemnets:");
        int n=sc.nextInt();   
        double sum=0;
        for(int i=1;i<=n;i++){ 
            System.out.print("enter number"+i+":");
            double number=sc.nextDouble();
            sum+=number;
        }
        double average=sum/n;
        System.out.println("sum is :"+sum);
        System.out.println("average is "+average);
        sc.close();
    }
}

