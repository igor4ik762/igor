package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FirstController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textA;

    @FXML
    private Button CalculateButton;

    @FXML
    private Label l1;

    @FXML
    private TextField textB;

    @FXML
    private TextField textC;

    @FXML
    void calculateCylinder(ActionEvent event) {
        if(textA.getText().equals("") || textB.getText().equals("") || textC.getText().equals("")) {
            l1.setText("поле не може бути пустим");
            return;
        }

        if(!textA.getText().matches("[0-9]*") || !textB.getText().matches("[0-9]*") || !textC.getText().matches("[0-9]*")) {
            l1.setText("ви ввели не коректні дані");
            return;
        }

        int a = Integer.parseInt(textA.getText());
        int b = Integer.parseInt(textB.getText());
        int c = Integer.parseInt(textC.getText());

        if(a + b <= c) {
            l1.setText("помилка з розмірами сторон");
            return;
        }
        if(a + c <= b) {
            l1.setText("помилка з розмірами сторон");
            return;
        }
        if(c + b <= a) {
            l1.setText("помилка з розмірами сторон");
            return;
        }
        l1.setText(" " + (a + b + c));
    }

    @FXML
    void initialize() {
        assert textA != null : "fx:id=\"textA\" was not injected: check your FXML file 'first.fxml'.";
        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'first.fxml'.";
        assert textB != null : "fx:id=\"textB\" was not injected: check your FXML file 'first.fxml'.";
        assert textC != null : "fx:id=\"textC\" was not injected: check your FXML file 'first.fxml'.";

    }
}

//public class FirstController {
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private TextField text1;
//
//    @FXML
//    private Button CalculateButton;
//
//    @FXML
//    private Label l1;
//
//    @FXML
//    void calculateCylinder(ActionEvent event) {
//        if(text1.getText().equals("")) {
//            l1.setText("Помилка: поле не може бути пустим");
//            return;
//        }
//
//        if(!text1.getText().matches("[-]?[0-9]*")) {
//            l1.setText("Помилка: ви ввели не коректні дані");
//            return;
//        }
//        int x = Integer.parseInt(text1.getText());
//        if(x >= -2 && x <= 3)
//            l1.setText(String.format(String.valueOf(x) + " все ок"));
//        else
//            l1.setText(String.format(String.valueOf(x) + " все не ок"));
//    }
//
//    @FXML
//    void initialize() {
//        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'first.fxml'.";
//        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
//        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'first.fxml'.";
//
//    }
//}

//public class FirstController {
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private Button CalculateButton;
//
//    @FXML
//    private TextField text1;
//
//    @FXML
//    private TextField text2;
//
//    @FXML
//    private TextField text3;
//
//    @FXML
//    private Label l1;
//
//    @FXML
//    private TextField textField;
//
//    @FXML
//    private Label resultLabel1;
//
//    @FXML
//    void calculateCylinder(ActionEvent event) {
//
//        if(text1.getText().equals("") || text2.getText().equals("") || text3.getText().equals("") ) {
//            l1.setText("Помилка: поле не може бути пустим");
//            return;
//        }
//
//        if(!text1.getText().matches("[0-9]*") || !text2.getText().matches("[0-9]*") || !text3.getText().matches("[0-9]*")) {
//            l1.setText("Помилка: ви ввели не коректні дані");
//            return;
//        }
//
//        int x = Integer.parseInt(text1.getText());
//        int y = Integer.parseInt(text2.getText());
//        int z = Integer.parseInt(text3.getText());
//        float result = (float) Math.sqrt(Math.pow(x, 2)) * y - 14 * z;
//        l1.setText(String.format("%.2f", result));
//    }
//
//    @FXML
//    void initialize() {
//        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
//        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'first.fxml'.";
//        assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'first.fxml'.";
//        assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'first.fxml'.";
//        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'first.fxml'.";
//        assert textField != null : "fx:id=\"textFieldAge\" was not injected: check your FXML file 'first.fxml'.";
//        assert resultLabel1 != null : "fx:id=\"resultLabel1\" was not injected: check your FXML file 'first.fxml'.";
//
//    }
//}

