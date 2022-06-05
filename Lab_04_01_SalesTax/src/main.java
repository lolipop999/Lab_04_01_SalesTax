public class main {
    public static void main(String[] args) {
        double SALES_TAX = 0.05;
        double costOfPurchase = 105.00;
        double totalCost;

        totalCost = costOfPurchase * (1 + SALES_TAX);

        System.out.println("The cost of your item was " + costOfPurchase + " dollars. Your total cost including sales tax is " + totalCost + " dollars.");
    }
}
