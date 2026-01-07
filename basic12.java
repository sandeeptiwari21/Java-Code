import java.util.Scanner;
public class basic12 {
    public static void checkequality(int a,int b){
        if(a-b==0){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }

    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int a,b;
        System.out.print("enter the first number:");
        a=Sc.nextInt();
        System.out.print("enter the second Number:");
        b=Sc.nextInt();
        //int a=69;
        //int b=70;
        checkequality(a, b);
    }
    
}
