package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PropagateExceptions implements Task{
    @Override
    public void run(Scanner scanner) {
        System.err.println("---AccessProvider2 App---");
        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            
            checkAge(age);

            System.out.println("Access is granted..Welcome!");
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Please enter a number.");
        }
    }
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access cannot be given because you are younger than 18!!!");
        }
    }
    public void checkAge(int age) throws InvalidAgeException {
        validateAge(age);  
    }
}
