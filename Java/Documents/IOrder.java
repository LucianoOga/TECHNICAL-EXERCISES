package Documents;

public interface IOrder {

    int getId();

    void setId(int id);

    String getDescription();

    void setDescription(String description);

    int getProducts();

    void setProducts(int products);

    double getPrice();

    void setPrice(double price);

    double getTotal();
}
