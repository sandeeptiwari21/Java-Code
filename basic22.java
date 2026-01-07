/*if cost price and selling price of an item is input through the keyboard ,write a program
to determine wheather the seller has made profit or incuurred loss .also determine 
how much profit he made or l0ss he incurred*/
import java.util.Scanner;
public class basic22 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter cost price");
        int cp=Sc.nextInt();
        System.out.println("enter selling price");
        int sp=Sc.nextInt();
        if(sp>cp){//profit
            System.out.print("your profit is:");
            System.out.println(sp-cp);
        }
       /*  if(cp>sp){//loss
            System.out.println("you incuured a loss");
        }*/
        else{
            System.out.print("your loss is:");
            System.out.println(cp-sp);
        }
    }
    
}
