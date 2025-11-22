package exceptionHandling;

import java.util.Scanner;

public class ToUpperCase implements Task{
    @Override
    public void run(Scanner scanner) {

        try {
            System.err.println("---toUpperCase App---");
            System.out.print("Enter a string you want to UpperCase it: ");
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                s = null;}
            String Result = s.toUpperCase();
            System.out.println("String in Upper Case ist: " + Result);
        } catch (NullPointerException e){
            System.out.println("You didn't enter anything!");
        }
    }
    
}
