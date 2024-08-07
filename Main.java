import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Main menu
        System.out.println("___________________________________________________");
        System.out.println("Enter the number next to what you want to do");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Log in");
        System.out.println("2. Create account");
        System.out.println("3. Exit (You can also type 'EXIT' in any menu to exit)");
        System.out.println("");

        //detects user input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int userInputInt = 0;
        
        //checks for valid user input
        try {
            userInputInt = Integer.parseInt(userInput);

            if (userInputInt > 3 || userInputInt < 1) {
                System.out.println(userInputInt + " is not an option, enter one of the given options");
            }
        } catch (Exception e) {
            System.err.println("Must input a number");
        }

        //runs code based on user input
        if (userInputInt == 1) {
            
        } else if (userInputInt == 2) {
            
        } else if (userInputInt == 3) {
            
        }
        
    }
}
    