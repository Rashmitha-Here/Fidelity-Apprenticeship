import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Overloading.Add("Priya","Mohan"));
//        Overloading.Add(10,20,30);
//        Overloading mth = new Overloading();
//        mth.Add("x","y","z");

        Scanner sc=new Scanner(System.in);
        System.out.println("Select the shape of the volume calculation:");
        System.out.println("select 1 for Cylinder & 2 for cube:");
        int select=sc.nextInt();

        Shape shape=null;

        switch (select){
            case 1:
                System.out.println("enter the radius for the cylinder:");
                double radius=sc.nextDouble();

                System.out.println("enter the height for the cylinder:");
                double height=sc.nextDouble();

                shape=new cylinder(radius,height);
                break;

                case 2:
                    System.out.println("Enter the length of the cube:");
                    double side=sc.nextDouble();
                    shape=new cube(side);
                    break;

            default:
                System.out.println("Invalid choice!");
                return;

        }
        if(shape!=null){
            double volume=shape.calculatevolume();
            System.out.println("the volume of the shape is:"+volume);
        }

    }
}