import java.util.Scanner;

public class SqureCube {
    static double findsqure(double number){
        return number*number;
    }

    static double findcube(double number){
        return number*number*number;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number=sc.nextDouble();

        double square=findsqure(number);
        double cube=findcube(number);

        System.out.println("Square of number is: "+square);
        System.out.println("cube of number is: "+cube);



    }
}
