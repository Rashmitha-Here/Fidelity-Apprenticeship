public class TemporaryEmployee extends Employee{
    int dailwages;
    int NoofDays;

    public TemporaryEmployee(int id,String name,int dailwages,int NoofDays){
        super(id, name,dailwages*NoofDays);
        this.dailwages=dailwages;
        this.NoofDays=NoofDays;
    }
    @Override
    public void calculatebonus(){

        if(dailwages<1000){
            bonus=0.15f*netsalary;
        } else if (dailwages>=1000 && dailwages<1500) {
            bonus=0.12f*netsalary;
        } else if (dailwages>=1500 && dailwages<1800) {
            bonus=0.11f*netsalary;
        }else{
            bonus=0.08f*netsalary;
        }
    }

    @Override
    public void calculatesalary(){
        netsalary=dailwages*NoofDays;
        calculatebonus();
        netsalary+=bonus;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Daily wages are:"+dailwages);
        System.out.println("Number of days worked:"+NoofDays);
    }
}
