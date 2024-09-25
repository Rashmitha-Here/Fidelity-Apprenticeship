import java.sql.SQLOutput;

public class Employee {
    int id;
    String name;
    float basicsalary;
    float bonus;
    float netsalary;

    public Employee(int id,String name,float basicsalary){
        this.id=id;
        this.name=name;
        this.basicsalary=basicsalary;
    }

    public void calculatebonus(){

    }
    public void calculatesalary(){

    }
    public void displaydetails(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Basic salary:"+basicsalary);
        System.out.println("Bonus:"+bonus);
        System.out.println("Net salary:"+netsalary);
    }

}
class permanentEmployee extends Employee{
    int pf;
    public permanentEmployee(int id, String name, float basicsalary,int pf){
        super(id, name,basicsalary);
        this.pf=pf;
    }

    @Override
    public void calculatebonus(){
//        netsalary=basicsalary-pf;
        if(pf<1000){
            bonus=0.10f*basicsalary;
        } else if (pf>=1000 && pf<1500) {
            bonus=0.115f*basicsalary;
        } else if (pf>=1500 && pf<1800) {
            bonus=0.12f*basicsalary;
        }else{
            bonus=0.15f*basicsalary;
        }
    }
    @Override
    public void calculatesalary(){
        netsalary=basicsalary-pf;
        calculatebonus();
        netsalary+=bonus;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("PF:"+pf);
    }
}

