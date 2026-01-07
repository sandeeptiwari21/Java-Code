import java.util.Scanner;
public class basic2{
    public static void calculatesum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value :");
        int a=sc.nextInt();
        System.out.println("enter the second value:");
        int b=sc.nextInt();
        int sum=a+b;
        //System.out.println(a);
       // System.out.println(b);
        System.out.println("sum is:"+sum);
        sc.close();

    }
    public static void main(String[] args) {
        calculatesum();
        
    }

}

