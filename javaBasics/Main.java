public class Main {

  public void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }
  public static void main(String[] args) {
    String name = "Mahmoud";
    System.out.println(name);
    final int myNum = 15;
    // myNum = 20; //can not overrite final variable
    System.out.println(myNum);
    String name1 = "John";
    System.out.println("Hello " + name1);
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    //----------------
    int x = 5;
    int y = 6;
    System.out.println("The sum is " + x + y);   // Prints: The sum is 56
    System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
  }
}