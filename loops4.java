import java.util.Scanner;
public class loops4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=i+1;
        }
        //calculate double
        double average=(double)sum/n;
        //display result
        System.out.println("sum of the first"+n+"natural numbers:"+sum);
        System.out.println("average of the first"+n+"natural numbers"+average);
        sc.close();
    }
    
}
