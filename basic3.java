import java.util.Scanner;
public class basic3{
    public static void circle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radious :");
        float rad=sc.nextFloat();
        double perimeter;
        double area;
        perimeter=2*3.14*rad;
        area=3.14*rad*rad;
        //System.out.print(rad);
        System.out.println("perimeter is:"+perimeter);
        System.out.println("area is :"+area);
        sc.close();


    }
    public static void main(String[] args) {
        circle();
        
    }

}

