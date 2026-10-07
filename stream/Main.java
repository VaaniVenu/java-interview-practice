import java.util.*;

public class Main {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
            new Employee(1, "Alice", "IT", 70000),
            new Employee(2, "Bob", "HR", 60000),
            new Employee(3, "Charlie", "IT", 85000),
            new Employee(4, "David", "Finance", 75000),
            new Employee(5, "Eva", "HR", 65000),
            new Employee(6, "Frank", "Finance", 90000),
            new Employee(7, "Grace", "IT", 80000),
            new Employee(8, "Henry", "HR", 55000)
        );
    }

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

    }
}
