import java.util.Scanner;
public class cond14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("enter the total distance travelled in km:");
         int distance=sc.nextInt();
         System.out.print("enter the fuel consumed (in litter):");
         float fuel= sc.nextFloat();
         //valid the inputs
         if(distance<=0|| fuel<=0){
            System.out.println("distance and fuel most be positive values");
         }
         else{
            //calculate the average consumption (liter per 100 km)
            float averageconsumption=(fuel/distance)*100;
            System.out.printf("the average fuel consumption is %2f litters per 100 kilometer %n",averageconsumption);
         }
         sc.close();

    }
    
}
