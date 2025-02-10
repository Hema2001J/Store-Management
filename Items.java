public class Items {

    protected int id;
    protected String name ;
    protected double price;
    protected int qty;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    

    

    public Items(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    @Override
    public String toString() {
        return "Items [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
    }
    
    
   
    



    
    
}
