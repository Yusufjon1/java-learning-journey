package Lesson8;

import java.util.Date;
import java.util.Locale;

public class formatExercises {
    public static void main(String[] args) {

        String customer = "Jasurbek Aliyev";
        double price = 1450000.758;
        Date now = new Date();

        System.out.printf(Locale.GERMANY, " ======================================== %n CUSTOMER:  %S %n DATE: %td. %<tB %<tY | %<tH:%<tM:%<tS %n PRICE: %,.2f %n ======================================== %n", customer, now, price);


        String passenger = "Sharofiddin Sadirov";
        int ticketNumber = 42;
        double price1 = 2850750.5;
        Date flightDate = new Date();

        String flightInfo = """
                ========================================
                ✈️ FLIGHT TICKET
                PASSENGER: %S
                TICKET NO: %05d
                FLIGHT:    %tY-%<tm-%<td | %<tH:%<tM
                PRICE:     %,.2f
                ======================================== %n
                """.formatted(passenger, ticketNumber, flightDate, price1);
        System.out.println(flightInfo);


        String sender = "Mirazam Miromonov";
        String receiver = "Ismaloq Turdialiyev";
        long taxId = 789;
        double amount = 5400900.85;
        Date txDate = new Date();

        String transactionInfo = """
                ========================================
                💳 BANK TRANSACTION
                ID: %08d
                DATE: %td.%<tm.%<tY
                
                SENDER: %S
                RECEIVER: %S
                
                TOTAL SUM: %,.2f UZS
                ======================================== %n
                """.formatted(taxId, txDate, sender, receiver, amount);
        System.out.println(transactionInfo);


        String customer1 = "Mirazam Pulatov";
        int orderId = 1045;
        double pricePerItem = 350000.8;
        int quantity = 3;
        Date orderDate = new Date();
        double total = pricePerItem * quantity;

        String overallPrice = """
                ========================================
                🛒 ONLINE SHOPPING ORDER
                ORDER ID: %06d
                DATE: %td.%<tm.%<tY | %<tH:%<tM:%<tS
                
                CUSTOMER: %S
                QUANTITY: %d
                TOTAL: %,.2f
                ========================================
                
                
                
                """.formatted(orderId, orderDate, customer1, quantity, total);

    }
}
