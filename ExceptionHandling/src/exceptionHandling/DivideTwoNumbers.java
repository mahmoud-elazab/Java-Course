package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbers implements Task {
    @Override
    public void run(Scanner scanner) {

        try {
            System.err.println("---DivideTwoNumbers App---");
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e){
            System.out.println("Please enter an Integer.");
        }
    }
    }