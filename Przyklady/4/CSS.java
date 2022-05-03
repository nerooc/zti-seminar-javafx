package zti;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CSS extends Application {
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Email");
        Text text2 = new Text("Password");

        Text responseText = new Text();
        responseText.setId("responseText");

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button buttonSubmit = new Button("Submit");
        buttonSubmit.setOnAction(event -> {
            responseText.setText("Logowanie...");
        });

        Button buttonClear = new Button("Clear");
        buttonClear.setOnAction(event -> {
            responseText.setText("");
            textField.clear();
            passwordField.clear();
        });


        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(buttonSubmit, 0, 2);
        gridPane.add(buttonClear, 1, 2);
        gridPane.add(responseText, 1, 3);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");

        Scene scene = new Scene(gridPane);

        scene.getStylesheets().add(CSS.class.getResource("style.css").toExternalForm());

        stage.setTitle("CSS Example");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}