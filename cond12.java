import java .util.Scanner;
public class cond12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the a:");
        int a=sc.nextInt();
        System.err.println("enter the b:");
        int b=sc.nextInt();

        System.out.print("enter operator:");
        char operator=sc.next().charAt(0);
        
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case'%':
            System.out.println(a%b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("wrong operator");

        }

sc.close();
    }
    
}
