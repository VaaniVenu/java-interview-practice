import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeSalaries {

    public void findTopThreeSalaries(List<Employee> employees) {

        List<Employee> topThreeSalEmp = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        topThreeSalEmp.forEach(emp ->
                System.out.println(emp.getName() + " -> " + emp.getSalary())
        );
    }
}
