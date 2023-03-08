package Documents;


public class Order implements IOrder{
    private int id;
    private String description;
    private int products;
    private double price;

    /**
     * Builder
     **/
    public Order(int id, String description, int products, double price) {
        this.id = id;
        this.description = description;
        this.products = products;
        this.price = price;
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String getDescription(){
        return this.description;
    }
    @Override
    public void setDescription(String description){
        this.description = description;
    }
    @Override
    public int getProducts(){
        return this.products;
    }
    @Override
    public void setProducts(int products){
        this.products = products;
    }
    @Override
    public double getPrice(){
        return this.price;
    }
    @Override
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public double getTotal() {
        return this.price * this.products;
    }


    public String toString() {
        return "PEDIDO --> id=" + id +
        " descripcion= " + description + 
        " productos=" + products + 
        " precio=" +price;             
    }
}