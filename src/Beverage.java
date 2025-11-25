public class Beverage extends MenuItem {
    String size;
    String temperature;

    public Beverage(String itemId, String name, double price, String size, String temperature) {
        super(itemId, name, price, "Beverage");
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public void getDetails() {
        System.out.print("ID: " + getItemId() + ", " + "Name: " + getName() + ", " + "Price: " + getPrice() + ", " + getCategory() + ", " + "Size: " + this.size + ", " + "Temperature:" + this.temperature);
    }
}
