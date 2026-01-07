import java.util.Scanner;
public class cond4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("enter the age:");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("they can vote ");
        }
        else{
            System.out.println("they can not vote");
        }
        sc.close();
    }
    
}
