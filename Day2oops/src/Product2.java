//Java using the Product class. The class should include private attributes: int ProductId, String ProductName,
// String Category, and a static String StoreName shared across all instances. Implement methods to initialize and
// display product details, as well as a static method to show the store name. In the main() method,
// prompt the user to input product details for two products,
// initialize them, and display their information along with the store name.

public class Product2 {
    private int productid;
    private String productName;
    static  String storename="Book store";

    public static void displaystore(){
        System.out.println("Store Name:"+storename);
    }

    public void initialize(int productid,String productName){
        this.productid=productid;
        this.productName=productName;
    }

    public void displayproductdetails(){
        System.out.println("Product id:"+productid+"\n product name:"+productName);
    }
}
