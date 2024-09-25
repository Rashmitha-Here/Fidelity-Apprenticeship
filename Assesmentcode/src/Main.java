import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        permanentEmployee obj1=new permanentEmployee(101,"Esther",25000,1500);
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 1 for permanent employee and 2 for temporary employee:");
        int employeetype=sc.nextInt();

        if(employeetype==1){
            System.out.println("Now Enter the permanent employee details below:");
            System.out.println("Enter employee Id:");
            int id=sc.nextInt();

            System.out.println("Enter employee name:");
            String name=sc.next();

            System.out.println("Enter employee Basic salary:");
            float employeebasicsalary=sc.nextFloat();

            System.out.println("Enter Pf amount:");
            int pf=sc.nextInt();

            permanentEmployee obj1=new permanentEmployee(id,name,employeebasicsalary,pf);
            obj1.calculatesalary();
            obj1.displaydetails();
        } else if (employeetype==2) {
            System.out.println("Enter employee Id:");
            int id=sc.nextInt();

            System.out.println("Enter employee name:");
            String name=sc.next();

            System.out.println("Enter Daily wages:");
            int dailywages=sc.nextInt();

            System.out.println("The number of days worked:");
            int Noofdays=sc.nextInt();

            TemporaryEmployee obj2=new TemporaryEmployee(id,name,dailywages,Noofdays);
            obj2.calculatesalary();
            obj2.displaydetails();
        }else{
            System.out.println("Invalid Employee Type! please choose 1 for permanent employee and 2 for temporary employee");
        }

    }
}