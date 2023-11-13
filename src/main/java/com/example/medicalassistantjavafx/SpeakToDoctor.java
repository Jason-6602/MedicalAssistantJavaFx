package com.example.medicalassistantjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SpeakToDoctor {

    @FXML
    private TextField ReasonForVisitField;

    @FXML
    private TextField SymptomsField;
@FXML
   private TextField DiagnosticField;

    @FXML
    private TextField labReportField;
    @FXML
    private void handleSpeakToDoctor() {
        String ReasonForVisit = ReasonForVisitField.getText().trim();
        String Symptoms = SymptomsField.getText().trim();
        String Diagnostic = DiagnosticField.getText().trim();
        String labReport = labReportField.getText().trim();

        // Reason for Visit and Symptoms variable
    }
}
