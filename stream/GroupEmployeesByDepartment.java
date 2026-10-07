import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {

    public void groupEmployeesByDepartment(List<Employee> employees) {

        Map<String, List<Employee>> empDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        empDept.forEach((department, employee) -> {

            System.out.println("Department: " + department);

            employee.forEach(emp ->
                    System.out.println(" - " + emp.getName())
            );
        });
    }
}
