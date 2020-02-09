import java.util.Scanner;
public class PurchaseDecision {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the color of item: Blue or Red");
        String color = scanner.nextLine();
        System.out.println("Enter the tag price:");
        double price =scanner.nextDouble();
        System.out.println("Enter the discount (0.1-0.9):");
        float discount = scanner.nextFloat();
        int colorvalue =0;
         int pointOfItem = (int) (discount*price-colorvalue);
        if (color.compareToIgnoreCase("Blue")==0)
        {
            colorvalue=10;
        }
        else if (color.compareToIgnoreCase("Red")==0)
        {
            colorvalue=20;

        }
        else
        {
            System.out.println("Enter only Red or Blue color");
        }
         if (pointOfItem>= 100 )
        {
         System.out.println("Do not buy");
        }
        else if (pointOfItem >=50 && pointOfItem<=90)
        {
         System.out.println("Buy Later");
        }
         else
             {
        System.out.println("Buy it now");
         }
     }
}
