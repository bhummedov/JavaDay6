import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =25;
        int javaPoint =35;
        if (age >=20 && age <=30 && javaPoint>=80) // Checks the age and javaPoint values
        {
            System.out.println("Job applicant" +(age*1.5 +javaPoint*4.5)); // outputs Job applicant based on calculation
        }
        else if (age>=20 && age<=30 && javaPoint<80) // Checks the age and javaPoint values
        {
            System.out.println("Job applicant" +(age*1.5 +javaPoint*3.5));   //outputs Job applicant based on calculation
        }
        else if (age >30 && javaPoint>=80)  // Checks the age and javaPoint values
        {
            System.out.println("Job applicant" +(age*1.1 +javaPoint*4.5)); // outputs Job applicant based on calculation
        }
        else if (age >30 && javaPoint<80)  //Checks the age and javaPoint values
        {
            System.out.println("Job applicant" +(age*1.1 +javaPoint*3.5)); // outputs Job applicant based on calculation
        }

    }
}

