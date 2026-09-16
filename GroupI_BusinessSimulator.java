public class GroupI_BusinessSimulator {
    public static void main(String[] args) {

        Item[] items = {
            new PercentDiscountItem("Beef (kg)", 14000.00, 4, 5.0),
            new NoDiscountItem("Chicken (kg)", 12000.00),
            new FlatDiscountItem("Pork (kg)", 11000.00, 5, 2000.00),
            new PercentDiscountItem("Goat Meat (kg)", 15000.00, 3, 10.0)
        };

        int[] quantities = {3, 2, 4, 3};

        System.out.println("===== FRESHCUT BUTCHERY =====");
        System.out.println("PRICE LIST");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-15s UGX %.2f%n", (i + 1), items[i].getName(), items[i].getPrice());
        }

        System.out.println("\n==== RECEIPT ====");
        double grandTotal = 0.0;

        for (int i = 0; i < items.length; i++) {
            double lineTotal = items[i].calculateTotal(quantities[i]);
            grandTotal += lineTotal;
            System.out.printf("%-15s x%d = UGX %.2f%n", items[i].getName(), quantities[i], lineTotal);
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL           = UGX %.2f%n", grandTotal);
    }
}