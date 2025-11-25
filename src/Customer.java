public class Customer extends Person {
    private String customerId;
    private int loyaltyPoints;

    public Customer(String name, String phoneNumber, String customerId, int loyaltyPoints) {
        super(name, phoneNumber);
        this.customerId = customerId;
        this.loyaltyPoints = loyaltyPoints;
    }

    public void addLoyaltyPoints() {

    }

    public void getDiscount() {

    }
    public String getCustomerId()
    {
        return customerId;
    }
    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }
    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }
    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints=loyaltyPoints;
    }


    @Override
    public void getInfo() {
        System.out.print("ID:"+this.customerId+", " +"Name:"+getName()+", "+"Phone:"+getPhoneNumber()+", "+"Loyalty Points:"+this.loyaltyPoints);
    }
}
