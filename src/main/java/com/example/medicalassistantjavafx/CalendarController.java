package com.example.medicalassistantjavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

public class CalendarController extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calendar Notification System");

    }

    @FXML
    private DatePicker datepicker;



    public void submitDate(){
        if(datepicker.getValue() != null) {
            String dateselected = datepicker.getValue().toString();
            System.out.println("The date you selected for your appointment is: " + dateselected);
            //need to have it send out an email to the user but need database
        }
    }







}