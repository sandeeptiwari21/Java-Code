import java.util.Scanner;
public class basic10{
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("a:");
        a=sc.nextInt();
        int b;
        System.out.print("b:");
        b=sc.nextInt();
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public static void main(String[] args) {
        swap();
        
    }
}

