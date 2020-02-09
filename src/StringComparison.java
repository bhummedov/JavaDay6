import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args){
        Scanner userInput = new Scanner (System.in); //creating scanner object to read from keyboard
        System.out.println("Please enter the shape: C for circle or R for rectangular or T for triangle");
        String shape = userInput.next(); //receiving data from the user

        if (shape.equals("C")){  //checks if the shape entered is C for circle
            System.out.println("Enter radius:"); // asks to enter radius value to calculate the perimeter
            double radius =userInput.nextDouble(); //receiving data from the user
            System.out.println("Perimeter :" +(2*3.14*radius)); // Calculates the perimeter
        }
        else if ( shape.equals("R")){
            System.out.println("Enter the width:"); // asks user to enter the width
            System.out.println("Enter the height"); // asks user to enter the height
            double width = userInput.nextDouble(); //receiving data from the user
            double height =userInput.nextDouble(); //receiving data from the user
            System.out.println("Perimeter :"+ 2*(height+width)); // Calculates the perimeter
        }
        else if( shape.equals("T")){
            System.out.println("enter edge1:"); // asks user to enter the edge1 value
            System.out.println("enter edge2:"); // asks user to enter the edge2 value
            System.out.println("enter edge3:"); // asks user to enter the edge3 value
            int edge1= userInput.nextInt();  //receiving data from the user
            int edge2 = userInput.nextInt(); //receiving data from the user
            int edge3= userInput.nextInt(); //receiving data from the user
            System.out.println("Perimeter :" +(edge1+edge2+edge3)); // Calculates the perimeter

        }
    }
}
