public class GuestItems {

    protected String name;
    protected double price;
   

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    

    public GuestItems(String name, double price) {
        this.name = name;
        this.price = price;
     
    }

    
}
