import java.util.Scanner;
public class fabonnaci {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the numbers terms:");
        int  terms=Sc.nextInt();
        int first=0,second=1;
        System.out.println("fabonaaci series upto"+terms+"terms:");
        for(int i=1;i<=terms;i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
        Sc.close();
    }
    
}
