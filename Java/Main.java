import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Documents.Invoice;
import Documents.Order;
import Documents.UrgentOrder;
/**
 * Exercise B-C
 * Class created to verify that the creation of Order, Urgent Order and Invoice
 * work fine.
 */
public class Main {
    public static void main(String[] args) {

        //Creation of orders
        Order order1 = new Order(1, "DescOrder1", 4, 10.0);
        Order order2 = new Order(2, "DescOrder2", 2, 15.0);
        UrgentOrder urgentOrder = new UrgentOrder(5, "DescUrgentOrder", 1, 25.0, LocalDate.of(2023,3,8));
         
        //Creation of orders list
        List<Order> listOrders = new ArrayList<>();
        listOrders.add(order1);
        listOrders.add(order2);
        listOrders.add(urgentOrder);
        
        //Creation invoice
        LocalDate date= LocalDate.of(2023, 3, 7);
        Invoice invoice = new Invoice(1,date, listOrders);

        //Print
        System.out.println(order1.toString());
        System.out.println(invoice.toString());
    }
    
}
