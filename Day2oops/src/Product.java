//Create a product class having proid, proname and price as data members and display as a member
//function. Display 5 products with its details.
public class Product {
    int proid;
    String proname;
    int price;

    public void display(){
        System.out.println("Product id:"+proid+"\n product name:"+proname+"\nproduct price:"+price);
    }
}
