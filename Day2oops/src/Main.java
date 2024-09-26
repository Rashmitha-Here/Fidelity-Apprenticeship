import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
//        Product pro=new Product();
//        pro.proid=10;
//        pro.proname="book";
//        pro.price=90;
//        pro.display();
        Product2 obj1=new Product2();
        Product2 obj2=new Product2();
        System.out.println("Enter the 1st product details:");
        System.out.println("product id:");
        int id1=sc.nextInt();
        System.out.println("product Name:");
        String Name1=sc.next();
        obj1.initialize(id1,Name1);



        System.out.println("Enter the 2st product details:");
        System.out.println("product id:");
        int id2=sc.nextInt();
        System.out.println("product Name:");
        String Name2=sc.next();
        obj2.initialize(id2,Name2);


        System.out.println("\n-------Store details------------");
        Product2.displaystore();

        System.out.println("\n-------product 1 details------------");
        obj1.displayproductdetails();

        System.out.println("\n-------product 2 details------------");
        obj2.displayproductdetails();


        //multilevel Inheritance
        System.out.println("--------MULTILEVEL INHERITANCE----------");
        OrderDetails obj3=new OrderDetails();
        obj3.Modelname="Lenovo";
        obj3.laptopPrice=65000;
        obj3.warranty= "2 Years";
        obj3.orderid=1;
        obj3.orderedproduct="Lenovo Laptop";
        obj3.ordered_customerName="Manu";
        obj3.ordered_date="20 jan 2024";
        obj3.Details();
    }
}