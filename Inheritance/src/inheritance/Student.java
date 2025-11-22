package inheritance;


public class Student extends BaseEntity {
    private double grade;

    public Student(){
        super("Mahmoud");
        System.out.println("Default Constructor Student");
    }
    // Getter and setter
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
