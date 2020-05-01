package pl.sda.order;

public class Item {
    private String name;
    private int quantity;
    private double price;


    public Item(String name, int quantity, double price) {
        this.name = name;
        /** Ilość sztuk  */
        this.quantity = quantity;
        /** Cena pojedyńczej sztuki  */
        this.price = price;
    }

    /**
     * Oblicza wartość pozycji zamówienia
     * @return
     */
    double calculate(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return name + " " + price + " zł "  + quantity + " szt.";
    }
}
