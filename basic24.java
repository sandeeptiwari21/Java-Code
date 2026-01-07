import java.util.Scanner;
public class basic24 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("eneter length:");
        int length=Sc.nextInt();
        System.out.println("enter breadth:");
        int breadth=Sc.nextInt();
        if(length==breadth){
            System.out.println("it is square");
        }
        else{
            System.err.println("it is not square");
        }
    }
}
