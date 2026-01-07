import java.util.Scanner;
public class basic9{
    public static void calculates(){
        Scanner sc=new Scanner(System.in);
        int principle;
        System.out.print("principle:");
        principle=sc.nextInt();
        int rate;
        System.out.print("rate:");
        rate=sc.nextInt();
        int time;
        System.out.print("time:");
        time=sc.nextInt();
        double simpleinterest;
        simpleinterest=((principle*rate*time)/100);
        System.out.println("simpleinterest:"+simpleinterest);
        sc.close();
    }
    public static void main(String[] args) {
        calculates();
    }
}

