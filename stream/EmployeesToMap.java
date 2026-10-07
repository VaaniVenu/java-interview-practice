import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesToMap {

    public void convertEmployeesToMap(List<Employee> employees) {

        Map<Integer, Employee> empMap = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        emp -> emp
                ));

        empMap.forEach((id, employee) -> {
            System.out.println(
                    id + " -> " + employee.getName()
            );
        });
    }
}
