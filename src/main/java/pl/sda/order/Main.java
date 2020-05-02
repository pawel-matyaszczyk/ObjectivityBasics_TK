package pl.sda.order;

public class Main {
    public static void main(String[] args) {

        Item item=new Item("Cukier", 3,4);
        System.out.println(item.toString());
        Item item2=new Item("Chleb", 1,3.5);
        System.out.println(item2.toString());
        System.out.println();
        Order order=new Order();
        order.addItem(item);
        order.addItem(item2);
        System.out.println(order.toString());
    }
}
