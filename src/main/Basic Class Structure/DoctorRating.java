import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter doctor's name: ");
        String doctorName = scanner.nextLine();

        Ratings rating = new Ratings(doctorName);

        // Example: Taking user input for ratings
        System.out.print("Enter a rating for " + rating.getName() + " (1-5): ");
        int userRating = scanner.nextInt();
        rating.addRating(userRating);

        // Displaying doctor information
        rating.displayDoctorInfo();

        // Close the scanner
        scanner.close();
    }
}