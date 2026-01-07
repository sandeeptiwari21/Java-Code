import java.util.Scanner;
public class basic7{
    public static void calculates(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of hour:");
        int hr=sc.nextInt();
        System.out.println("enter the min value:");
        int min=sc.nextInt();
        int totnum=(hr*60+min);
        System.out.println("totnum:"+totnum);
    }
    public static void main(String[] args) {
  calculates();      
    }
}
