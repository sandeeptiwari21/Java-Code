import java.util.Scanner;
public class basic1{
    public static int  perimeter(){
        Scanner sc=new Scanner(System.in);
        int height;
        int width;
        System.out.println("enter the height");
         height=sc.nextInt();
         System.out.println("enter the width");
        width=sc.nextInt();
        int perimeter=2*(height+width);
        System.out.println("perimeter is:"+perimeter);
        sc.close();
        return perimeter;

    }
    public static void main(String args[]){
perimeter();

    }
}
