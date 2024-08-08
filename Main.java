import java.util.Scanner;

import AccountCreation.AccountCreation;

public class Main {
    public static void main(String[] args) {
        //Main menu
        System.out.println("___________________________________________________");
        System.out.println("Enter the number next to what you want to do");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Log in");
        System.out.println("2. Create account");
        System.out.println("3. Exit");
        System.out.println("");

        //detects user input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int userInputInt = 0;
        

        //checks for valid user input
        try {
            userInputInt = Integer.parseInt(userInput);

            if (userInputInt > 3 || userInputInt < 1) {
                System.out.print("");
                System.err.println(userInputInt + " is not an option, enter one of the given options");
            }
        } catch (Exception error) {
            System.out.print("");
            System.err.println("Must input a number ");
        }


        //runs code based on user input
        if (userInputInt == 1) {
            
        } else if (userInputInt == 2) {
            AccountCreation.accountCreation();
        } else if (userInputInt == 3) {
            System.exit(0);
        }
        
        scanner.close();
    }
    
}
    