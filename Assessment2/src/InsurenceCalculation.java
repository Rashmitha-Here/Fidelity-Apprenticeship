import java.util.Scanner;

public class InsurenceCalculation {
    private String insurenceNo;
    private String insurenceName;
    private double amtcovered;

    public String getInsurenceNo(){
        return insurenceNo;
    }
    public String getInsurenceName(){
        return insurenceName;
    }

    public double getAmtcovered() {
        return amtcovered;
    }

    public InsurenceCalculation(String insurenceNo, String insurenceName, double amtcovered){
        this.insurenceNo=insurenceNo;
        this.insurenceName=insurenceName;
        this.amtcovered=amtcovered;
    }
}

class MotorInsurence extends InsurenceCalculation{
    private double idv;
    private float depPercent;

    public double getIdv(){
        return idv;
    }

    public float getDepPercent(){
        return depPercent;
    }
    public MotorInsurence(String insurenceNo, String insurenceName, double amtcovered, float depPercent){
        super(insurenceNo, insurenceName,amtcovered);
        this.depPercent=depPercent;
        this.idv=amtcovered-((amtcovered*depPercent)/100);
    }

    public double calPremium(){
        return  0.03*idv;
    }
}
class LifeInsurence extends InsurenceCalculation{
    private int policyTerm;
    private float benefitPercent;


    public int getPolicyTerm(){
        return policyTerm;
    }

    public float getbenefitPercent(){
        return benefitPercent;
    }


    public LifeInsurence(String insurenceNo, String insurenceName, double amtcovered,int policyTerm,float benefitPercent){
        super(insurenceNo, insurenceName,amtcovered);
        this.policyTerm=policyTerm;
        this.benefitPercent=benefitPercent;
    }

    public double calPremium(){
        return (getAmtcovered()-((getAmtcovered()*benefitPercent)/100))/policyTerm;
    }

}

class Programs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Insurence Number: ");
        String insurenceNo=sc.next();

        System.out.println("Enter a Insurence Name: ");
        String insurenceName=sc.next();

        System.out.println("Amount covered :");
        double amtcovered=sc.nextDouble();

        System.out.println("Select \n 1 for Life Insurence \n 2 for Motor Insurence");
        int choosen=sc.nextInt();

        if(choosen==1){
            System.out.println("policy terms: ");
            int policyterm=sc.nextInt();
            System.out.println("Benifit percentage: ");
            float benefitperc=sc.nextFloat();

            LifeInsurence LI=new LifeInsurence(insurenceNo,insurenceName,amtcovered,policyterm,benefitperc);
            double premium=addPolicy(LI,choosen);
            System.out.println("calculate premium:"+premium);
        } else if (choosen==2) {
            System.out.println("Dep percentage:");
            float depPercent=sc.nextFloat();

            MotorInsurence MI=new MotorInsurence(insurenceNo,insurenceName,amtcovered,depPercent);
            double premium=addPolicy(MI,choosen);
            System.out.println("calculate premium:"+premium);
        }else{
            System.out.println("Incorrect Choosen:");
        }

    }

    public static double addPolicy(InsurenceCalculation ins, int opt){
        if(opt==1){
            return ((LifeInsurence)ins).calPremium();
        } else if (opt==2) {
            return ((MotorInsurence)ins).calPremium();
        }
        return 0;
    }
}