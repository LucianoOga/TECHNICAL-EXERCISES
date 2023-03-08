package Documents;

import java.time.LocalDate;
import java.util.List;

public class Invoice implements IInvoice{
    private int num;
    private LocalDate date;
    private List<Order> orders;
    private double total;

    /*
    * Builder
    */
    public Invoice(int num, LocalDate date, List<Order> orders){
        this.num = num;
        this.date = date;
        this.orders = orders;
        this.total = Total(orders);
    }

    private double Total(List<Order> Orders) {
        double total = 0.0;
        for(int i=0; i<=Orders.size()-1; i++){
            total += Orders.get(i).getTotal();
        }
        return total;
    }
    @Override
    public int getNum() {
        return num;
    }
    @Override
    public LocalDate getDate() {
        return date;
    }
    @Override
    public void setDate(LocalDate date){
        this.date = date;
    }
    @Override
    public List<Order> getOrders() {
        return orders;
    }
    @Override
    public void setOrders(List<Order> orders){
        this.orders = orders;
    }
    @Override
    public double getTotal(){
        return this.total;
    }

    public String toString() {
        String result = "Factura " +num;
        for (int i = 0; i <= orders.size()-1; i++) {
            result += orders.get(i).toString();
        }
        result += "Total: " + Total(orders);
        return result;
    }
}
