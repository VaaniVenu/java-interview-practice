import java.util.List;
import java.util.stream.Collectors;

public class EmployeesAboveAverageSalary {

    public void findEmployeesAboveAverageSalary(List<Employee> employees) {

        double avgSal = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        List<Employee> higherAvgSalary = employees.stream()
                .filter(emp -> emp.getSalary() > avgSal)
                .collect(Collectors.toList());

        for (Employee emp : higherAvgSalary) {
            System.out.println(
                    emp.getName() + " -> " + emp.getSalary()
            );
        }
    }
}
