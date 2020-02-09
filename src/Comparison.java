import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the: M or F");
        String gender = scanner.next();
        if (gender.equals("M")) // checks the input if it is "M" or "F" entered by user
        {
            System.out.println("Gender is: Male"); // based on the input prints out as a output
        }else if (gender.equals ("F"))// checks the input if it is "M" or "F" entered by user
        {
            System.out.println("Gender is: Female"); // based on the input prints out as a output
        }
        else
        {
            System.out.println("Please enter M or F"); //if input does not mach for M or F it asks you to enter M or F
        }

    }
}
