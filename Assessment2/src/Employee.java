import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
    private  String name;
    public Employee(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
class EmpFilter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();

        System.out.println("Enter Employee names and \n type exit to terminate/close");

        while (true){
            String input=sc.next();

            if("exit".equalsIgnoreCase(input)){
                break;
            }
            employees.add(new Employee(input));
        }

        List<Employee> filteredemp=employees.stream().filter(employee -> employee.getName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Employee names start with A is: ");
        filteredemp.forEach(employee -> System.out.println(employee.getName()));

    }
}
