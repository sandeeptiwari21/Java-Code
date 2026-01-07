import java .util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,fact=1;
        System.out.print("enter an number");
        n= sc.nextInt();
        while(n>1){
            fact=fact*n;
            n--;

        }
        System.out.printf("fact is %d",fact);
    }
    
}
