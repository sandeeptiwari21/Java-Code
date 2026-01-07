import java.util.Scanner;
public class loops22 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        boolean flag= false;// false means prime
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(flag==false)
        System.out.println("prime number");
        else
        System.out.println("composite number");
    }
    
}
