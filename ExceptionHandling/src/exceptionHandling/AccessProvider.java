package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccessProvider implements Task{
    @Override
    public void run(Scanner scanner) {
        System.err.println("---AccessProvider App---");
        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            if (age < 18 ){
                throw new InvalidAgeException("Access cannot be given because you are younger than 18");
            }
            System.out.println("Access is granted..Welcome!");
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Please enter a number.");
        }
    }
}
