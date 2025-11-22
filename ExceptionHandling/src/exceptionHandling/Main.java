package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Task[] tasks ={new DivideTwoNumbers(),
        new StringToInteger(),
        new ToUpperCase(),
        new AccessArrayElements(),
        new FileReader(),
        new DivideTwoNumbers(),
        new AccessProvider(),
        new PropagateExceptions(),
        new FinallyBlock()
        };
        
        System.out.println("1: DivideTwoNumbers");
        System.out.println("2: StringToInteger");
        System.out.println("3: ToUpperCase");
        System.out.println("4: AccessArrayElements (Surprise Game)");
        System.out.println("5: FileReader");
        System.out.println("6: DivideTwoNumbers");
        System.out.println("7: AccessProvider");
        System.out.println("8: PropagateExceptions");
        System.out.println("9: FinallyBlock");
        System.out.println("Please choose the number of the App you want to test");
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
        if (choice < 1 || choice > tasks.length) {
            System.out.println("Invalid choice, the number should be from 1 to 9!");
            return;
        }
        tasks[choice-1].run(scanner);
        } catch (InputMismatchException e){
            System.out.println("Please enter a Valid Number.");
        }
        
        scanner.close();
    }
}