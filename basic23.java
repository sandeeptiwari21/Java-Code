import java.util.Scanner;
public class basic23 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the lenmgth:");
        int length=Sc.nextInt();
        System.out.println("enter the breadth:");
        int breadth=Sc.nextInt();
        int area=length*breadth;
        int perimeter=2* (length+breadth);
        if(area>perimeter){
            System.out.println("area is greater then  perimetr");
        }
        else{
            System.out.println("perimeter is greater than area");
        }
    }
    
}
