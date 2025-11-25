public abstract class MenuItem {
    private String itemId;
    private String name;
    private double price;
    private String category;

    public MenuItem(String itemId, String name, double price, String category) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public abstract void getDetails();
    public String getItemId()
    {
        return this.itemId;
    }
    public String getName()
    {
        return getName();
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public String getCategory()
    {
        return this.category;
    }
}
