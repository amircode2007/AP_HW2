public class Food extends MenuItem{
  private  String spiceLevel;
     private int preparationTime;
    public Food(String itemId, String name, double price, String category ,String spiceLevel,int preparationTime)
    {
    super(itemId,name,price,category);
    this.spiceLevel=spiceLevel;
    this.preparationTime=preparationTime;
    }

    @Override
    public void getDetails() {
        System.out.print("ID: "+getItemId()+", "+"Name: "+getName()+", "+"Price: "+getPrice()+", "+getCategory()+", "+"Spice: "+this.spiceLevel+", "+"Preparation Time: "+this.preparationTime);
    }
}
