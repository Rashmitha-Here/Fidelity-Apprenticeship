//Implement a user defined function to handle Age eligibility to vote
import java.util.Scanner;

public class Vote {
    public static void checkeligibility(int age){
        switch(age){
            case 18:
                System.out.println("your eligible to vote.");
                break;
            default:
                if(age>18){
                    System.out.println("your eligible to vote.");
                }else{
                    System.out.println("your not eligible to vote.");
                }
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        checkeligibility(age);
    }
}
