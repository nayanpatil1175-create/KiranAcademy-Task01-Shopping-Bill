package task1_java;


public class ShoppingBill {

    // Step 1: Add 18% GST to electronics
    public static double calculateElectronicsGST(double a, double b) {
        double amount = a + b;
        double gst = amount * 18 / 100;
        return amount + gst;
    }

    // Step 2: Add 13% GST to fashion
    public static double calculateFashionGST(double c, double d) {
        double amount = c + d;
        double gst = amount * 13 / 100;
        return amount + gst;
    }

    // Step 3: Add 7% GST to food
    public static double calculateFoodGST(double e) {
        double gst = e * 7 / 100;
        return e + gst;
    }

    // Step 4: Calculate total bill after GST
    public static double totalBill(double a, double b, double c, double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);

        return electronics + fashion + food;
    }

    // Step 5: Calculate discount and final payable amount
    public static double calculateDiscountedBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }

    public static void main(String[] args) {

        // Sample test values provided in the assignment
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Electronics after GST: Rs. %.2f%n", electronics);
        System.out.printf("Fashion after GST: Rs. %.2f%n", fashion);
        System.out.printf("Food after GST: Rs. %.2f%n", food);
        System.out.printf("Total after GST: Rs. %.2f%n", total);
        System.out.printf("Discount (20%%): Rs. %.2f%n", discount);
        System.out.printf("Final payable amount: Rs. %.2f%n", finalAmount);
    }
}

		
		
		
	


