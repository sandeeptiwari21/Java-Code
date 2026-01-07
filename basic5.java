import java.util.Scanner;
public class basic5{
    public static void converts(){
        Scanner sc=new Scanner(System.in);
        int celsius=sc.nextInt();
        int fahrenheit=((celsius*9/5)+32);
        System.out.println("fahrenheit is:"+fahrenheit);
        sc.close();
    }
    public static void main(String[] args) {
        converts();
        
    }
}
