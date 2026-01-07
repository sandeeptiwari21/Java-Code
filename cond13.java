import java.util.Scanner;
public class cond13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of minutes:");
        int totalminutes=sc.nextInt();

        int hours=totalminutes/60;
        int minutes=totalminutes%60;

        System.out.println(totalminutes+"minutes is equivalent to"+hours+"hours and"+minutes+"minutes");
        sc.close();
    }
    
}
