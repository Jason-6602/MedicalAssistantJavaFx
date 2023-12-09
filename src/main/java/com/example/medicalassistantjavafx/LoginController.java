package com.example.medicalassistantjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label infoLabel;

    @FXML
    private void handleLogin() {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();
/*
        if (// Check if the email and password are valid ) {

            infoLabel.setText("Login successful!");
        } else {
            infoLabel.setText("Invalid email or password. Please try again.");
        }*/
    }
}