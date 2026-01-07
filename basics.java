import java.util.Scanner;
public class basics{
    public static void main(String[] args) {
        int Marks[]=new int[100];
        Scanner sc=new Scanner(System.in);

        Marks[0]=sc.nextInt();//phy
        Marks[1]=sc.nextInt();//chem
        Marks[2]=sc.nextInt();//math


        System.out.println("physics"+Marks[0]);
        System.out.println("chemistry"+Marks[1]);
        System.out.println("math"+Marks[2]);

        Marks[2]=Marks[2]+1;
        System.out.println("Math"+Marks[2]);

        int percentage=(Marks[0]+Marks[1]+Marks[2])/3;

        System.out.println("percentage="+percentage+"%");

    }
}