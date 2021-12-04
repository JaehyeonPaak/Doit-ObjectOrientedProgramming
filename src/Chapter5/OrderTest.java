package Chapter5;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.number = "2021041200001";
        order.ID = "wogus392";
        order.date = "04.12.2021";
        order.name = "Jaehyeon";
        order.oderNumber = 24524135;
        order.address = "Gunpo-si Geumsan-ro";
        System.out.println("Oder number: " + order.number);
        System.out.println("ID of orderer: " + order.ID);
        System.out.println("Order date: " + order.date);
        System.out.println("Oderer name: " + order.name);
        System.out.println("Product number: " + order.oderNumber);
        System.out.println("Adress: " + order.address);
    }
}
