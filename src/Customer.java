public class Customer extends Person {
    private String customerId;
    private int loyaltyPoints=0;

    public Customer(String name, String phoneNumber, String customerId) {
        super(name, phoneNumber);
        this.customerId = customerId;
        this.loyaltyPoints = loyaltyPoints;
    }

    public void addLoyaltyPoints(double totalAmount) {
        if(totalAmount>500000 && totalAmount<1000000)
        {
            setLoyaltyPoints(getLoyaltyPoints()+1);
        }
        if(totalAmount>1000000)
        {
            setLoyaltyPoints(getLoyaltyPoints()+2);
        }
    }

    public double getDiscount() {
        if(getLoyaltyPoints()>=5)
        {
           return 0.10;
        }
        if(getLoyaltyPoints()>=3 && getLoyaltyPoints()<5)
        {
           return 0.05;
        }
        return 0;
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
