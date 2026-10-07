import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryByDepartment {

    public void findHighestSalaryByDepartment(
            List<Employee> employees) {

        Map<String, Optional<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparingDouble(
                                                Employee::getSalary
                                        )
                                )
                        ));

        result.forEach((department, employee) ->
                System.out.println(
                        department + " -> " +
                        employee.get().getName() + " -> " +
                        employee.get().getSalary()
                )
        );
    }
}
