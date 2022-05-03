package zti;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Label text;
    @FXML
    private TextField textField;

    @FXML
    protected void onButtonClick() {
        text.setText("Zmieniono tytul okna!");
        Stage mainWindow = (Stage)textField.getScene().getWindow();
        mainWindow.setTitle(textField.getText());
    }
}