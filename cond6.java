import java.util.Scanner;
public class cond6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //read score for 4 subject
        System.out.println("enter the marks of subject1");
        double subject1= sc.nextDouble();

        System.out.println("enter the marks of subject2");
        double subject2= sc.nextDouble();

        System.out.println("enter the marks of subject3");
        double subject3= sc.nextDouble();

        System.out.println("enter the marks of subject4");
        double subject4= sc.nextDouble();

        //calculate total numberb and percentage

        double totalnumber=subject1+subject2+subject3+subject4;
        double percentage=(totalnumber/400)*100;//each number of subject 100

        //define grade
        String grade;
        if(percentage<35){
            grade="F";
        }
        else if(percentage<45){
            grade="D";
        }
        else if(percentage<55){
            grade="c";
        }
        else if(percentage<75){
            grade="b";
        }
        else{
            grade="a";
        }
        //print the result

        System.out.printf(" total percentage is: %2f%% \n",percentage);
        System.out.println("grade:"+grade);
        sc.close();

    }

}
