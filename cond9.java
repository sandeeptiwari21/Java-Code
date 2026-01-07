import java.util.Scanner;
public class cond9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the daynumber(1 for monday,2 for tuesday,3 for wednesday,4 for thursday ,5 friday,6 for saturday,7 for sunday)");
       int daynumber= sc.nextInt();
       //determine the dayname bassed on the input

       String dayname;
       switch(daynumber){
        case 1:
        dayname="monday";
        break;
        case 2:
        dayname="tuesday";
        break;
        case 3:
        dayname="wednesday";
        break;
        case 4:
        dayname="thursday";
        break;
        case 5:
        dayname="friday";
        break;
        case 6:
        dayname="saturday";
        break;
        case 7:
        dayname="sunday";
        break;
        default:
        dayname="invalid daynumber! please inter a day number between 1 and 7";
       }
       //display the dayname
       System.out.println("day:"+dayname);
       sc.close();
    }
    
}
