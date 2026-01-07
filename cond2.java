import java.util.Scanner;
public class cond2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the value a");
        a=sc.nextInt();
        int b;
        System.out.println("enter the value b:");
        b=sc.nextInt();
        int c;
        System.out.println("enter the value c:");
        c=sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("largest value is the a");
        }
       else  if(b>=c){
            System.out.println("largest value is b");
        }
        else{
            System.out.println("largest value is c");
        }
        
    }
    
}
