package Documents;

import java.time.LocalDate;
import java.util.List;

public interface IInvoice {

    int getNum();

    LocalDate getDate();

    void setDate(LocalDate date);

    List<Order> getOrders();

    void setOrders(List<Order> orders);

    double getTotal();
    
}
