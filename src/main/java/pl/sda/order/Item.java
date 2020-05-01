package pl.sda.order;

public class Item {
    private String name;
    private int quantity;
    private double price;


    public Item(String name, int quantity, double price) {
        this.name = name;
        /** Ilość sztuk  */
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Oblicza wartość pozycji zamówienia
     * @return
     */
    double calculate(){
        return 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
