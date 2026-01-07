import java.util.Scanner;
public class basic11{
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x=sc.nextInt();
        System.out.print("enter the value of y:");
        int y=sc.nextInt();
        //swap
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+"");
        System.out.println("y="+y+"");
    }
    public static void main(String[] args) {
        swap();
        
    }
}
