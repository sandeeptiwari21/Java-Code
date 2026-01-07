import java.util.Scanner;
public class string1 {
    public static void printletters(String str){
        for(int i=0;i<str.length(); i++){
            System.out.print(str.charAt(i)+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String firstname="sandeep";
        String LastName="tiwari";
        String fullName=firstname+" "+LastName;
        printletters(fullName);
    }
    
}
