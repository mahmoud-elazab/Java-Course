package stream;

import java.util.*;
import java.util.stream.*;



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
        System.out.println(" -----------------------");
        System.out.println("|Basic Stream Operations|");
        System.out.println(" -----------------------");
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


        //Count the number of strings longer than 5 characters.
        System.out.println(" -------------------------");
        System.out.println("|Intermediate Stream Tasks|");
        System.out.println(" -------------------------");
        long count = names.stream().filter(name->name != null && !name.isEmpty()).filter(name->name.length()>5).count();
        System.out.println("Count the number of strings longer than 5 characters is:\n"+ count);
        System.out.println("--------------------------------------------");


        //Find the first element in a stream that matches a given condition.
        Optional<String> firstElem = names.stream().filter(name->name != null && !name.isEmpty()).filter(name->name.toUpperCase().startsWith("A")).findFirst();
        System.out.println("Find the first element in a stream that starts with a/A:");
        System.out.println(firstElem.orElse("Not Found") );
        System.out.println("--------------------------------------------");


        //Check if any number is divisible by 5 in a list.
        boolean divByN = numbers.stream().anyMatch(n->n%5==0);
        System.out.println("is there any number dividable by 5? true or false:");
        System.out.println(divByN );
        System.out.println("--------------------------------------------");

        //Collect elements into a Set instead of a List.
        Set<String> namesUpperCaseSet = names.stream().filter(name->name != null && !name.isEmpty()).map(name->name.toUpperCase()).collect(Collectors.toSet());
        System.out.println("Elements collect into a Set:");
        System.out.println(namesUpperCaseSet );
        System.out.println("--------------------------------------------");

        //Skip the first 3 elements and return the rest.
        List<String> namesAfterIndex = names.stream().skip(3).toList();
        System.out.println("Skip the first 3 elements and return the rest of the list:");
        System.out.println(namesAfterIndex);
        System.out.println("--------------------------------------------");

        //Calculate the sum of a list of integers using reduce.
        System.out.println(" ----------------------------");
        System.out.println("|Numeric Stream and reduction|");
        System.out.println(" ----------------------------");
        int sum = numbers.stream().reduce(0, (x,y)->x+y);
        System.out.println("The sum of the list is:");
        System.out.println(sum );
        System.out.println("--------------------------------------------");

        //Find the maximum and minimum value in a list.
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("The min number in the list is:");
        System.out.println(min.orElse(null) );
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("The max number in the list is:");
        System.out.println(max.orElse(null) );
        System.out.println("--------------------------------------------");

        //Calculate the average of a list of doubles.
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("The average of the list is:");
        System.out.println(average.orElse(0.0) );
        System.out.println("--------------------------------------------");

        //Multiply all integers in a list together using reduce.
        int multiplication = numbers.stream().reduce(1, (x,y)->x*y);
        System.out.println("The multiplication of the list is:");
        System.out.println(multiplication );
        System.out.println("--------------------------------------------");

        //Count how many numbers are positive in a list.
        long countPositive = numbers.stream().filter( n->(n>0)).count();
        System.out.println("The count of positive numbers of the list is:");
        System.out.println(countPositive );
        System.out.println("--------------------------------------------");


        //Group a list of students by their department.
        System.out.println(" ---------------------");
        System.out.println("|Collectors & Grouping|");
        System.out.println(" ---------------------");
        Map<String, List<Student>> studentByDept = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println("The list by their department is:");
        studentByDept.forEach(
            (dept, list) -> {
            System.out.println(dept + ":");
            list.forEach(s -> System.out.println("   " + s.getName()));
        });
        System.out.println("--------------------------------------------");

        //Partition a list of numbers into even and odd using partitioningBy.
        Map<Boolean, List<Integer>> numbersEvenOrOdd = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Partition a list of numbers into even and odd using partitioningBy:");
        numbersEvenOrOdd.forEach(
            (type, list) -> {
                if (type == true){System.out.println("Even numbers:");

                } else{
                    System.out.println("Odd numbers:");
                }
            String result = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(result);
        });
        System.out.println("--------------------------------------------");

        //Create a comma-separated string from a list of strings.
        System.out.println("Create a comma-separated string from a list of strings:");
        String commaSeparatedString = names.stream().filter(name->name != null && !name.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(commaSeparatedString);
        System.out.println("--------------------------------------------");

        //Group employees by age and count how many per age.
        System.out.println("Group employees by age and count how many per age:");
        Map <Integer, Long> empCountedPerAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
        empCountedPerAge.forEach((age, countperAger) ->
        System.out.println("Age " + age + ": " + countperAger));
        System.out.println("--------------------------------------------");

        //Find the average salary per department in a list of employees.
        System.out.println("Find the average salary per department in a list of employees:");
        Map <String, Double> avgSalaryPerDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryPerDept.forEach((dept, avgSalary) ->
        System.out.println("Dept: " + dept + "----> Average Salary: " + avgSalary));
        System.out.println("--------------------------------------------");


        //Flatten a list of lists into a single list.
        System.out.println(" ----------------------");
        System.out.println("|Optional, Map, FlatMap|");
        System.out.println(" ----------------------");
        System.out.println("Flatten a list of lists into a single list:");
        List<String> flatList = nestedWords.stream().flatMap(list->list.stream()).toList();
        System.out.println(flatList);
        System.out.println("--------------------------------------------");


        //Extract all unique characters from a list of words.
        System.out.println("Flatten a list of lists into a single list:");
        List<Character> uniqueChar = names.stream().filter(name->name != null && !name.isEmpty()).flatMap(word -> word.chars().mapToObj(c -> (char) c)).distinct().toList();
        System.out.println(uniqueChar);
        System.out.println("--------------------------------------------");










    }
}