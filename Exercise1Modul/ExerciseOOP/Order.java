package Exercise1Modul.ExerciseOOP;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int table;
    private final List<MenuItem> items = new ArrayList<>();

    public Order(int table) {
        if (table <= 0) {
            throw new IllegalArgumentException("table number must be greater than zero");
        }
        this.table = table;
    }

    public void addItem(MenuItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item must not be null");
        } else {
            items.add(item);
        }
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String getReceipt() {
        String receipt = "Order for table " + table + "\n";
        for (MenuItem item : items) {
            receipt += "- " + item.getDescription() + "\n";
        }
        receipt += "Items: " + getItemCount() + "\n";
        receipt += "Total: " + calculateTotal() + " €";
        return receipt;
    }
}
