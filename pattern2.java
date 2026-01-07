import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
       // for(int i=1;i<=5;i++){
          //System.out.println("****");
        //}
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int m=Sc.nextInt();
        System.out.println("enter the columns:");
        int n=Sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
