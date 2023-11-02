module com.example.medicalassistantjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.medicalassistantjavafx to javafx.fxml;
    exports com.example.medicalassistantjavafx;
}