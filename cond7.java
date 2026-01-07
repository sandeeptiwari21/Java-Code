import java.util.Scanner;
public class cond7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//enter the costprice and sellingprice

        System.out.println("enter the costprice:");
        double costprice= sc.nextDouble();

        System.out.println("enter the selling price");
        double sellingprice= sc.nextInt();

        if(sellingprice>costprice){
            double profit= sellingprice-costprice;
            System.out.println("profit :"+profit);;
        }
        else if(costprice>sellingprice){
            double loss= costprice-sellingprice;
            System.out.println("loss :"+loss);
        }
        else{
            System.out.println("no profit no loss");
        }
sc.close();
    }
}
