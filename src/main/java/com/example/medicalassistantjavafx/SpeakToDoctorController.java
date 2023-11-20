// SpeakToDoctorController.java
package com.example.medicalassistantjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SpeakToDoctorController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @FXML
    private void scheduleappointment(ActionEvent event) {
        // Patient information
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();

        boolean appointmentScheduled = scheduleAppointment(firstName, lastName);

        if (appointmentScheduled) {
            showAlert("Appointment Confirmed!", "Your appointment has been scheduled successfully.");
        } else {
            showAlert("Appointment Error", "Sorry, there was an error scheduling your appointment.");
        }
    }

    private boolean scheduleAppointment(String firstName, String lastName) {
        return true;
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    // Alerted if appointment had issues or cancellation
}
