package Exercise1Modul.ExerciseOOP;


public class RestaurantApp {
    static void main(String[] args) {

        MenuItem doner = new MenuItem("doner", 8.5);
        MenuItem burger = new MenuItem("burger", 7.9);
        MenuItem tea = new MenuItem("tea", 2);
        MenuItem[] menu = {doner, burger, tea};
        for (MenuItem item : menu) {
            System.out.println(item.getDescription());
        }
        double total = calculateTotal(menu);
        System.out.println("Total: " + total + " €");


    }

    private static double calculateTotal(MenuItem[] menu) {
        double total = 0;

        for (MenuItem item : menu) {
            total += item.price;
        }
        return total;
    }


}
