import java.util.Scanner;
public class basic4{
    public static void triangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base value:");
      float base=sc.nextFloat();
      System.out.print("enter the height:");
    
      float height=sc.nextFloat();
      double area=0.5*height*base;
      System.out.println("araea is:"+area);
      sc.close();
    }
    public static void main(String[] args) {
        triangle();
        
    }
}

