
import java.util.Scanner;

public class Calculator {
    public int Add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }

    public  double div(int a,int b,double[] remainder){
        if(b==0)
        {
            throw  new ArithmeticException("division by zero is not allowed.");
        }
        remainder[0]=a%b;
        return (double) a/b;
    }

}
class program{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Calculator cal=new Calculator();

        System.out.println("enter 1st operand");
        int op1=sc.nextInt();

        System.out.println("enter 2st operand");
        int op2=sc.nextInt();


        System.out.println("enter an operator(+,-,*,/):");
        char choice=sc.next().charAt(0);


        double[] remainder=new double[1];

        switch (choice){
            case '+':
                System.out.println("Result:" +cal.Add(op1,op2));
                break;

            case '-':
                System.out.println("Result:" +cal.sub(op1,op2));
                break;

            case '*':
                System.out.println("Result:" +cal.mul(op1,op2));
                break;

            case '/':
                try{
                    double quotient=cal.div(op1,op2,remainder);
                    System.out.println("Quotient:" +quotient+ ",Remainder:" +remainder[0]);
                }catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator. plz enter ");
                break;

        }
    }
}
