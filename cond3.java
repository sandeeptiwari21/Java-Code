import java.util.Scanner;
public class cond3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("enter the number:");
        number=sc.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        //check number is negative or positive
        if(number>=0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }
    }
    
}
