import java.util.Scanner;
public class cond1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("enter the year:");
        year=sc.nextInt();
        if(year%4==0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("this is not leap year");

        }
sc.close();
    }
    
}
