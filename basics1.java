import java.util.Scanner;
public class basics1{
    public static void update(int Marks[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<Marks.length;i++){
            Marks[i]=Marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int Marks[]={97,98,99};
        update(Marks);
        //print our marks
        for(int i=0; i<Marks.length;i++){
            System.out.print(Marks[i]+" ");
        }
        System.out.println();
    }
}
