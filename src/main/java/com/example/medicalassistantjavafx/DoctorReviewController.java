package com.example.medicalassistantjavafx;// DoctorReviewController.java
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DoctorReviewController {

    @FXML
    private TextField doctorNameField;

    @FXML
    private TextArea experienceTextArea;

    public void submitReview() {
        String doctorName = doctorNameField.getText();
        String experience = experienceTextArea.getText();

        // You can handle the review data (e.g., save to a database) based on your requirements

        System.out.println("Review submitted for " + doctorName + ": " + experience);

        // Optionally, you can close the current stage or perform other actions
    }

    // New method to set review text
    public void setReviewText(String reviewText) {
        // Implement your logic to set the review text in the UI (e.g., display it in a label)
    }
}