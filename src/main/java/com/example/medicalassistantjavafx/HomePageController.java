package com.example.medicalassistantjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    private Button doctorreview;

    @FXML
    private void handleDoctorReviewButtonClick(ActionEvent event) {
        try {
            // Load the DoctorReview.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorReview.fxml"));
            Parent root = loader.load();

            // Get the controller for the DoctorReview.fxml file
            DoctorReviewController doctorReviewController = loader.getController();

            // Set review text or perform other logic as needed
            doctorReviewController.setReviewText("Sample Doctor Review");

            // Set up the scene
            Scene scene = new Scene(root, 600, 400);

            // Create a new stage for the doctor review page
            Stage doctorReviewStage = new Stage();
            doctorReviewStage.setTitle("Doctor Review");
            doctorReviewStage.setScene(scene);

            // Show the doctor review stage
            doctorReviewStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }


}


