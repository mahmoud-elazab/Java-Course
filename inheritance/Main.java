package inheritance;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);
        Student student = new Student();

        // System.out.print("Enter name: ");
        // student.setName(sc.nextLine());

        System.out.print("Enter ID: ");
        student.setId(sc1.nextInt());
        sc1.nextLine(); // consume leftover newline

        System.out.print("Enter address: ");
        student.setAddress(sc1.nextLine());

        System.out.print("Enter grade: ");
        student.setGrade(sc1.nextDouble());

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Grade: " + student.getGrade());
        sc1.close();
    }
}