package pl.sda.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    /**
     * Liczba pozycji w zamówieniu
     */
    private int counter;
    /**
     * Max liczba pozycji w zamówieniu
     */
    private int maxSize;


    public Order() {
        this.maxSize = 10;
        items = new ArrayList<Item>();
    }

    public Order(int maxSize) {
        items = new ArrayList<Item>();
        this.maxSize = maxSize;
    }

    void addItem(Item i) {
        items.add(i);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zamówienie:\n");
        for (Item i :items ) {
            builder.append(i.toString() + "\n");
        }
        builder.append("\nRazem: " + String.format("%.2f zł",calculateValue()));
        return builder.toString();
    }

    /**
     * Oblicza wartość zamówienia
     *
     * @return wartość zamówienia
     */
    double calculateValue() {
        double sumValue = 0;
        for (Item i : items) {
            sumValue += i.calculate();
        }

        return sumValue;
    }

    void delItem(int index) {

    }
}
