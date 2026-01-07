import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        
        for(int i=1; i<=n;i++){
            System.out.println(i+" ");
        }
    }
    
}
