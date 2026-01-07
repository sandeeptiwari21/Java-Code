import java.util.Scanner;
public class cond11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the height of a person in cm");
        int height=sc.nextInt();

        if(height<150){
            System.out.println("dwarf");
        }
    else if(height>=150 && height<200){
    System.out.println("avreage");
    }
  else if(height>200) {
        System.err.println("tall");
    }
    else{
        System.out.println("invalid height entered");
        sc.close();
    }
}
}
