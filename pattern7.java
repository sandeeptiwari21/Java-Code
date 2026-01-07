import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0)
                System.out.print(j+" ");
                else
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    
}
