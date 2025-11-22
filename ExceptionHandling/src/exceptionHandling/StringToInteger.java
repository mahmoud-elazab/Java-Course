package exceptionHandling;

import java.util.Scanner;

public class StringToInteger implements Task{
    @Override
    public void run(Scanner scanner) {

        try {
            System.err.println("---StringToInteger App---");
            System.out.print("Enter a number in a String: ");
            String s = scanner.nextLine();
            int result = Integer.parseInt(s);
            System.out.println("Converted Number is: " + result);
        } catch (NumberFormatException e){
            System.out.println("Invalid number format!");
        }
    }
}
