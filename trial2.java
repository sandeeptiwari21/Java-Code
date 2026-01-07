import java.util.Scanner;
public class trial2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a number:");
        n=sc.nextInt();
        int counter=0;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
    
}
