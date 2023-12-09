package com.example.medicalassistantjavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



public class CalendarController extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calendar Notification System");
    }

    @FXML
    public void initialize(){
        //choicebox gets filled up here
        choiceBox.getItems().add("Dr. Strawberry");
        choiceBox.getItems().add("Dr. Blueberry");
        choiceBox.getItems().add("Dr. Raspberry");
        choiceBox.getItems().add("Dr. Blackberry");
        choiceBox.getItems().add("Dr. Apple");

        //dr. strawberry will be the default value
        choiceBox.setValue("Dr. Strawberry");
    }

    @FXML
    private DatePicker datepicker;

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<>();

    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;



    @FXML
    //this was replaced with sendEmaiL()
    public void submitDate(){
        if(datepicker.getValue() != null) {
            String dateselected = datepicker.getValue().toString();
            System.out.println("The date you selected for your appointment with " + choiceBox + " is: " + dateselected);
        }
    }

    @FXML
    public void sendEmail() {
        //email stuff

        String fromEmail = "medicalassistantfsc@gmail.com";
        String fromPassword = "oady pvdk mkiz jvqm";


        String toEmail = textField.getText().toString();
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Medical Assistant Appointment Notification");
            message.setText("You have set an appointment with " + choiceBox.getValue().toString() + " for: " + datepicker.getValue().toString());

            Transport.send(message);

            System.out.println("Email sent successfully!");
            /*
            IF YOU SEE EMAIL SENT SUCCESSFULLY IN CONSOLE AND DO NOT SEE EMAIL IN YOUR INBOX, IT MAY HAVE BEEN SENT TO YOUR SPAM FOLDER
             */

        } catch (MessagingException e) {
            e.printStackTrace();
        }

        textArea.setText("You have an appointment with: " + choiceBox.getValue().toString() + " on: "+ datepicker.getValue().toString());
    }




}