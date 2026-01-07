//write a program to print the sum of all even and odd numbers separately upto n term
import java.util.Scanner;
public class loops30 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum +=i;
            }
            else{
                oddsum+=i;
            }
        }
        System.out.println("sum of even numbers upto"+n+":"+evensum);
        System.out.println("sum of odd numbers upto"+n+":"+oddsum);
        Sc.close();

    }
    
}
