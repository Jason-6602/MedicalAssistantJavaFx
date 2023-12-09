module com.example.medicalassistantjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;


    opens com.example.medicalassistantjavafx to javafx.fxml;
    exports com.example.medicalassistantjavafx;
}