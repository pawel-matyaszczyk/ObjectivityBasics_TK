package pl.sda.order;

import java.util.List;

public class Order {
    private List<Item> items;
    /**Liczba pozycji w zamówieniu*/
    private int counter;
    /** Max liczba pozycji w zamówieniu  */
    private int maxSize;


    public Order() {
        this.maxSize=10;
    }

    public Order(int maxSize) {
        this.maxSize = maxSize;
    }

    void addItem(Item i){

    }

    /**
     * Oblicza wartość zamówienia
     * @return wartość zamówienia
     */
    double calculateValue() {
        return 0;
    }

    void delItem(int index){

    }
}
