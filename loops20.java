// display this Ap-4,7,10,13,16....up to'n' terms
import java.util.Scanner;
public class loops20 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Sc.nextInt();
       /*  for(int i=4;i<=3*n+1;i+=3){
            System.out.println(i);
        }*/
        //display this gp 1,2,4,8,,16,32
        int a=1, r=2;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a*=r;
            
        }
    }
    
}
