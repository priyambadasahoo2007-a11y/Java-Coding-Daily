/* You're creating a store receipt generator. Use printf to display prices with exactly 2 decimal places.

Create a receipt with the following items:

A T-shirt priced at $19.99
A pair of jeans priced at $45.50
A hat priced at $12.00
Requirements:

Use printf to display all prices with exactly 2 decimal places
Calculate and display the subtotal, tax (8%), and final total
Use %.2f for all dollar amounts*/

public class StoreReceipt {

    public static void main(String[] args) {
        // Item information
        String item1 = "T-shirt";
        String item2 = "Jeans";
        String item3 = "Hat";
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.00;

        // Calculate totals
        double subtotal = price1 + price2 + price3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;

        // Create receipt
        System.out.println("STORE RECEIPT");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f\n", item1, price1);
        System.out.printf("%s: $%.2f\n", item2, price2);
        System.out.printf("%s: $%.2f\n", item3, price3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
