// Controller file (Controller.java)
package com.example.validation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField contactField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private Button validateButton;

    @FXML
    private Label validationMessage;

    @FXML
    void validateData() {
        String username = usernameField.getText();
        String contactNumber = contactField.getText();
        String postalCode = postalCodeField.getText();

        boolean isValid = true;

        if (!isValidUsername(username)) {
            validationMessage.setText("Invalid username format!");
            isValid = false;
        }

        if (!isValidContactNumber(contactNumber)) {
            validationMessage.setText("Invalid contact number format!");
            isValid = false;
        }

        if (!isValidPostalCode(postalCode)) {
            validationMessage.setText("Invalid postal code format!");
            isValid = false;
        }

        if (isValid) {
            validationMessage.setText("All fields validated successfully!");
        }
    }

    private boolean isValidUsername(String username) {
        if (username.isEmpty()) {
            return false;
        }
        if (!Character.isUpperCase(username.charAt(0))) {
            return false;
        }
        return true;
    }

    private boolean isValidContactNumber(String contactNumber) {
        if (contactNumber.isEmpty()) {
            return false;
        }
        if (contactNumber.length() != 10) {
            return false;
        }
        for (char c : contactNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidPostalCode(String postalCode) {
        if (postalCode.isEmpty()) {
            return false;
        }
        if (!postalCode.matches("[A-Z]{3} [0-9]{3}")) {
            return false;
        }
        return true;
    }
}