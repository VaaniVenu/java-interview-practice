import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {

    public void sortEmployeesBySalary(List<Employee> employees) {

        List<Employee> empSal = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        empSal.forEach(emp ->
                System.out.println(emp.getName() + " -> " + emp.getSalary())
        );
    }
}
