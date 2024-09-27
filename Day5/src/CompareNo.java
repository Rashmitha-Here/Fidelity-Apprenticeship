import java.awt.*;
import java.util.Scanner;

public class CompareNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X value:");
        int x=sc.nextInt();
        System.out.println("Enter the Y value:");
        int y=sc.nextInt();

        boolean value=x<y;

        System.out.println("The value of X is less than Y is "+value);

    }
}
