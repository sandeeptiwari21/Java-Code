import java.util.Scanner;
public class basic26 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
          int n=Sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("print the number is divisible by 5 but not 3");
        }
    }
    
}

