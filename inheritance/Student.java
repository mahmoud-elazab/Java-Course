package inheritance;

import java.util.Scanner;

public class Student extends BaseEntity {
    private double grade;

    // Getter and setter
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter ID: ");
        student.setId(sc.nextInt());
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter address: ");
        student.setAddress(sc.nextLine());

        System.out.print("Enter grade: ");
        student.setGrade(sc.nextDouble());

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Grade: " + student.getGrade());
    }
}
