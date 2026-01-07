import java.util.Scanner;
public class basic25 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        if(n>10 && n<100){
            System.out.println("it is 2 digit number");
        }
        else{
            System.out.println("it is not 2 digit number");
        }
    }
    
}
