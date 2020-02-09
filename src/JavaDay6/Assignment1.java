package JavaDay6;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter consumption:");
        int consumption = scanner.nextInt();
        if (consumption < 500) // Checks if consumption usage less than 500
        {
            System.out.println("$0.3 per kW"); // outputs as a price $0.3 per kW
        }
        else if (consumption >= 500 && consumption <= 1000) // Checks if consumption usage between 500 and 1000
        {
            System.out.println("$0.4 per kW");   // outputs as a price $0.4 per kW
        }
        else if (consumption >= 1000 && consumption <= 2000)  // Checks if consumption usage between 1000 and 2000
        {
            System.out.println("$0.4 per kW");  // outputs as a price $0.5 per kW
            }
        else    //if consumption usage greater 2000
            {
                System.out.println("$0.6kW"); // outputs $0.6kW
            }
        }
    }

