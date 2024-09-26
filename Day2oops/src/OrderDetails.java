public class OrderDetails extends ProductLaptop{
    int orderid;
    String orderedproduct;
    String ordered_customerName;
    String ordered_date;

    @Override
    public void Details(){
        super.Details();
        System.out.println("Order id:"+orderid+"\nordered product:"+orderedproduct+
                "\nordered customer name:"+ordered_customerName+"\nordered date:"+ordered_date);

    }

}
