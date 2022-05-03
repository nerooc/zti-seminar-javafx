package zti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Label text = new Label();
        text.setText("Hello World!");
        root.getChildren().add(text);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }
}