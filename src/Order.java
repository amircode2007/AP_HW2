import java.util.List;
public class Order {
    private static int orderCounter = 1;

    private int orderId;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount=0;

    public Order( Customer customer, List<MenuItem> items) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.items = items;
        calculateTotal();
    }

    public void calculateTotal()
    {
        double sum=0;
        for(MenuItem Item : items)
        {
            sum+=Item.getPrice();
        }
        customer.addLoyaltyPoints(sum);

        double discount = sum * customer.getDiscount();
        totalAmount = sum - discount;
    }
    public void getOrderSummary()
    {
        System.out.print("OrderI ID: "+orderId+", "+"Customer: "+customer.getName()+", "+"Total Amount: "+totalAmount+"\n"+"Items: ");
        for(MenuItem Item : items)
        {
            System.out.print(Item.getName()+" - ");
        }
    }
    public double getTotalAmount()
    {
        return this.totalAmount;
    }


}
