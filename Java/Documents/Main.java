package Documents;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Documents.HumanResources.Contract;
/**
* Exercise F
* This Main class was created with the intention of being able to create a document of the type chosen by the user, it was left incomplete as an attempt was made to solve the genericity problem
* in the Document class without success and due to time issues it was not finalized
* with implementation.
* 
**/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("QUE TIPO DE DOCUMENTO DESEA CREAR?: ");
        System.out.println("1- Order");
        System.out.println("2- Urgent order");
        System.out.println("3- Invoice");
        System.out.println("4- Contract");
        System.out.println("5- CV");
        int op = scanner.nextInt();

        if(op == 1){
            System.out.println("Ingrese id: ");
            int data1 = scanner.nextInt();
            System.out.println("Ingrese descripción: ");
            String data2 = scanner.nextLine();
            System.out.println("Ingrese cantidad de productos: ");
            int data3 = scanner.nextInt();
            System.out.println("Ingrese precio: ");
            double data4 = scanner.nextInt();
            Order order1 = new Order(data1,data2,data3,data4);
            Document<Order> document= new Document<>(order1);
        }
        if(op == 2){
            System.out.println("Ingrese id: ");
            int data1 = scanner.nextInt();
            System.out.println("Ingrese descripción: ");
            String data2 = scanner.nextLine();
            System.out.println("Ingrese cantidad de productos: ");
            int data3 = scanner.nextInt();
            System.out.println("Ingrese precio: ");
            double data4 = scanner.nextInt();
            System.out.println("Ingrese fecha de entrega: ");
            double data5 = scanner.nextInt();
            Order order2 = new Order(data1,data2,data3,data4);
            Document<UrgentOrder> document= new Document<>(order2);
        }
        if(op == 3){
            List listOrder = new ArrayList<>();
            System.out.println("Ingrese numero de factura: ");
            int date1 = scanner.nextInt();
            System.out.println("Ingrese fecha: ");
            String date2 = scanner.nextLine();
            System.out.println("Cuantos pedidos desea ingresar?");
            int data3 = scanner.nextInt();
            for(int i=data3; i>=0; i--){
                System.out.println("Ingrese pedido");
                System.out.println("Ingrese id: ");
                int dateA = scanner.nextInt();
                System.out.println("Ingrese descripción: ");
                String dateB = scanner.nextLine();
                System.out.println("Ingrese cantidad de productos: ");
                int dateC = scanner.nextInt();
                System.out.println("Ingrese precio: ");
                double dateD = scanner.nextInt();
                Order orderA = new Order(date1,date2,date3,date4);
                listOrder.add(orderA);
            }
            LocalDate fecha = LocalDate.parse(date2);
            Invoice invoice = new Invoice(date1,fecha,listOrder);

            Document<Invoice> document= new Document<>(invoice);
        }
        if(op == 4){
            System.out.println("Ingrese id: ");
            int data1 = scanner.nextInt();
            System.out.println("Ingrese descripción: ");
            String data2 = scanner.nextLine();
            System.out.println("Ingrese cantidad de productos: ");
            int data3 = scanner.nextInt();
            System.out.println("Ingrese precio: ");
            double data4 = scanner.nextInt();
            System.out.println("Ingrese fecha de entrega: ");
            double data5 = scanner.nextInt();
            Order order2 = new Order(data1,data2,data3,data4);
            Document<UrgentOrder> document= new Document<>(order2);
        }
        if(op == 5){
            System.out.println("Ingrese id: ");
            int data1 = scanner.nextInt();
            System.out.println("Ingrese descripción: ");
            String data2 = scanner.nextLine();
            System.out.println("Ingrese cantidad de productos: ");
            int data3 = scanner.nextInt();
            System.out.println("Ingrese precio: ");
            double data4 = scanner.nextInt();
            System.out.println("Ingrese fecha de entrega: ");
            double data5 = scanner.nextInt();
            Order order2 = new Order(data1,data2,data3,data4);
            Document<UrgentOrder> document= new Document<>(order2);
        }

    }
}
