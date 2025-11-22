package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock implements Task{
    @Override
    public void run(Scanner scanner) {
        System.err.println("---Surprise App---");
        String[] arr = {"A Candy", "Nothing", "A Bar of Chocolate", "Nothing! Go Away!", "iPhone 17 Pro max"};
        try {
            System.out.print("Enter a number from 0 to " + (arr.length-1) + " to get your Surprise: ");
            int a = scanner.nextInt();
            String Result = arr[a];
            System.out.println("Your surprise is.... " + Result);
        } catch (InputMismatchException e){
            System.out.println("I told you to enter a number!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I told you to enter a number only between 0 and " + (arr.length-1) + "!");
        } finally {
            System.out.println("Thank you and Goodbye!");
        }
    }
}

