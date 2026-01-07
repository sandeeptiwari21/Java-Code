import java .util.Scanner;
public class cond10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the monthnumber(1 for january,2 for february,3 for march,4 for april,5 for may,6 for june,7 for july,8 for august,9 for september,10 for october,11 for november,12 for december)");
        int monthnumber=sc.nextInt();

        //determine the monthname based in the input

        String monthname;
        switch(monthnumber){
            case 1:
            monthname="january";
            break;
            case 2:
            monthname="february";
            break;
            case 3:
            monthname="march";
            break;
            case 4:
            monthname="april";
            break;
            case 5:
            monthname="may";
            break;
            case 6:
            monthname="june";
            break;
            case 7:
            monthname="july";
            break;
            case 8:
            monthname="august";
            break;
            case 9:
            monthname="september";
            break;
            case 10:
            monthname="october";
            break;
            case 11:
            monthname="november";
            break;
            case 12:
            monthname="december";
            break;
            default:
            monthname="invalid monthnumber! please enter the number between 1 and 12";
            break;
        }
        //display the month name
        System.out.println("month:"+monthname);
        sc.close();
        
    }

}
