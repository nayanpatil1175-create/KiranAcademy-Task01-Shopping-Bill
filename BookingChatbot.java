
package chatbot.com;

import java.security.SecureRandom;
import java.util.Scanner;

public class BookingChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        while (true) {

            System.out.println("\n===== CAB Booking Chatbot =====");
            System.out.println("1. Book ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter 1 or 2.");
                sc.next();
                continue;
            }

            int menu = sc.nextInt();

            // Exit option
            if (menu == 2) {
                System.out.println("Goodbye!");
                break;
            }

            if (menu != 1) {
                System.out.println("Invalid choice! Please select 1 or 2.");
                continue;
            }

            // Choose cab type
            System.out.println("\n===== Choose Cab Type =====");
            System.out.println("1. Auto - Rs. 12/km");
            System.out.println("2. Sedan - Rs. 18/km");
            System.out.println("3. SUV - Rs. 25/km");
            System.out.print("Enter cab choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Booking cancelled.");
                sc.next();
                continue;
            }

            int choiceCab = sc.nextInt();

            String cabType;
            int rate;

            switch (choiceCab) {
                case 1:
                    cabType = "Auto";
                    rate = 12;
                    break;

                case 2:
                    cabType = "Sedan";
                    rate = 18;
                    break;

                case 3:
                    cabType = "SUV";
                    rate = 25;
                    break;

                default:
                    System.out.println("Invalid cab choice!");
                    continue;
            }

            // Choose route
            System.out.println("\n===== Choose Route =====");
            System.out.println("1. Pune Station to Shivajinagar (5 km)");
            System.out.println("2. Swargate to Kothrud (8 km)");
            System.out.println("3. Hinjawadi to Wakad (10 km)");
            System.out.print("Enter route choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Booking cancelled.");
                sc.next();
                continue;
            }

            int routeChoice = sc.nextInt();

            String source;
            String destination;
            int distance;

            switch (routeChoice) {
                case 1:
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                    break;

                case 2:
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                    break;

                case 3:
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                    break;

                default:
                    System.out.println("Invalid route choice!");
                    continue;
            }

            // Calculate fare
            int fare = distance * rate;

            System.out.println("\n===== FARE DETAILS =====");
            System.out.println("Cab Type: " + cabType);
            System.out.println("Source: " + source);
            System.out.println("Destination: " + destination);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Rate: Rs. " + rate + "/km");
            System.out.println("Total Fare: Rs. " + fare);

            // Confirm booking
            System.out.println("\n===== CONFIRM BOOKING =====");
            System.out.println("1. Confirm and generate OTP");
            System.out.println("2. Cancel ride");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Booking cancelled.");
                sc.next();
                System.out.println("No OTP has been generated.");
                continue;
            }

            int confirmChoice = sc.nextInt();

            if (confirmChoice == 2) {
                System.out.println("Ride cancelled successfully.");
                System.out.println("No OTP has been generated.");
                continue;
            }

            if (confirmChoice != 1) {
                System.out.println("Invalid choice! Booking cancelled.");
                System.out.println("No OTP has been generated.");
                continue;
            }

            // Generate a 4-digit OTP
            int otp = 1000 + random.nextInt(9000);

            System.out.println("\n===== BOOKING CONFIRMED =====");
            System.out.println("Your ride has been booked successfully!");
            System.out.println("Your OTP is: " + otp);
            System.out.println("Please share this OTP with the driver.");

            // Lock cancellation after OTP generation
            System.out.println("\nRide is now locked.");
            System.out.println("Cancellation is not allowed after OTP sharing.");
            System.out.println("Returning to the main menu...");
        }

        sc.close();
    }
}
