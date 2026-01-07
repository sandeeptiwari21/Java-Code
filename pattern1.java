//wap to print product of digits of a given number
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int product=1;
        while(n!=0){
            product=product*(n%10);
            n/=10;
        }
        System.out.println(product);
    }
}
