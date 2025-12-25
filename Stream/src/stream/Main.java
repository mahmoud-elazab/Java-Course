package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        List<Student> students = Arrays.asList(
            new Student("Ali", "IT", 85),
            new Student("Mona", "CS", 92),
            new Student("Ahmed", "IT", 60),
            new Student("Sara", "CS", 70),
            new Student("Omar", "IS", 45),
            new Student("Laila", "IS", 78)
        );
        List<Employee> employees = Arrays.asList(
            new Employee("Ali", 30, "HR", 5000),
            new Employee("Mona", 25, "IT", 7000),
            new Employee("Ahmed", 30, "HR", 5500),
            new Employee("Sara", 27, "IT", 7200),
            new Employee("Omar", 40, "Finance", 8000),
            new Employee("Laila", 35, "Finance", 8200)
        );
        List<List<String>> nestedWords = Arrays.asList(
            Arrays.asList("Java", "Stream"),
            Arrays.asList("API", "Lambda"),
            Arrays.asList("FlatMap", "Map")
        );

        //Filter even numbers from a list of integers.
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).distinct().sorted().toList();
        System.out.println("--------------------------------------------");
        System.out.println("Filter even numbers from a list of integers:");
        System.out.println(evenNumbers);
        System.out.println("--------------------------------------------");

        //Find names starting with a specific letter from a list of strings.
        List<String> namesWith = names.stream().filter(name->name != null && !name.isEmpty()).filter(name->name.toUpperCase().startsWith("A")).distinct().toList();
        System.out.println("Names starting with letter A from a list of strings:");
        System.out.println(namesWith);
        System.out.println("--------------------------------------------");

        //Convert all strings to uppercase using stream.
        List<String> namesUpperCase = names.stream().filter(name->name != null && !name.isEmpty()).map(name->name.toUpperCase()).toList();
        System.out.println("All strings to uppercase using stream:");
        System.out.println(namesUpperCase );
        System.out.println("--------------------------------------------");

        //Sort a list of integers in descending order using streams.
        List<Integer> integerSorted = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sort a list of integers in descending order using streams:");
        System.out.println(integerSorted );
        System.out.println("--------------------------------------------");

        //Remove duplicate elements from a list using distinct().
        List<Integer> integerSortedDis = numbers.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println("Remove duplicate elements from a list using distinct():");
        System.out.println(integerSortedDis );
        System.out.println("--------------------------------------------");


    }
}