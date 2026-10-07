import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

    public void findSecondHighestSalary(List<Employee> employees) {

      Optional<Employee> secondMaxSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
      System.out.println("Second Maximum Salary: " + secondMaxSalary.get().getSalary());
      
    }
}
