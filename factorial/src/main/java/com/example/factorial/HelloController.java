package com.example.factorial;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField number;

    @FXML
    private TextField factorial;

    @FXML
    protected void onButtonClick() {
        String text = number.getText();
        int num = Integer.parseInt(text);
        Integer факториал = 1;
        for(int i = 1; i <= num; i++) {
            факториал = факториал * i;
        }
        factorial.setText(факториал.toString());
    }
}