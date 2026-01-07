import java.util.Scanner;
public class basic6{
    public static void converts(){
        Scanner sc=new Scanner(System.in);
        int kmph=sc.nextInt();
       double mph=kmph*0.621371;
       System.out.println("mph:"+mph);

    }
    public static void main(String[] args) {
        converts();
        
    }

}