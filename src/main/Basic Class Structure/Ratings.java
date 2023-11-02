import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ratings {

    private String name;
    private List<Integer> ratings;

    public Ratings(String name) {
        this.name = name;
        this.ratings = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
            System.out.println("Rating added successfully.");
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }

        return (double) sum / ratings.size();
    }

    public void displayDoctorInfo() {
        System.out.println("Doctor: " + name);
        System.out.println("Average Rating: " + getAverageRating());
        System.out.println("Total Ratings: " + ratings.size());
    }
}


