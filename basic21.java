import java.util.Scanner;
public class basic21{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter any integer:");
        int n=Sc.nextInt();
        if(n<0){//if n is less than  zero
            n=n*(-1);
        }
        System.out.println("the absolute value is  :"+n);
    }
}

