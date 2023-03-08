package Documents;

import java.time.LocalDate;

public class UrgentOrder extends Order {
    private LocalDate deliverDate;

    /*
     * Builder
     */
    public UrgentOrder (int id, String description, int products, double price, LocalDate deliverDate){
        super(id, description, products, price);
        this.deliverDate = deliverDate;
    }

    public LocalDate getDeliverDate(){
        return this.deliverDate;
    }

    public void setDeliverDate(LocalDate deliverDate){
        this.deliverDate = deliverDate;
    }

    public String toString() {
        return "OrderUrgent --> id=" + getId() +
        " description= " + getDescription() + 
        " products=" + getProducts() + 
        " price=" +getPrice() +
        " deliverDate=" +getDeliverDate();             
    }

}
