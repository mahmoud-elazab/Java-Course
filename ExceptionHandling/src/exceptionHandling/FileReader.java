package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Task{
    @Override
    public void run(Scanner scanner) {
        System.err.println("---FileReader App---");
        try {
            System.out.print("Please enter the path of the file you want to read: ");
            String a = scanner.nextLine();
            File file = new File(a);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
