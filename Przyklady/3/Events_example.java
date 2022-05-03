package zti;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;


public class Events_example extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Events!");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Rectangle lRect = new Rectangle();
        lRect.setHeight(100.0);
        lRect.setWidth(20.0);
        lRect.setX(20.0);
        lRect.setY(300.0);
        lRect.setFill(Color.color(0.1, 0.1, 1.0, 1.0));

        Rectangle rRect = new Rectangle();
        rRect.setHeight(100.0);
        rRect.setWidth(20.0);
        rRect.setX(600.0);
        rRect.setY(300.0);
        rRect.setFill(Color.color(0.1, 0.1, 1.0, 1.0));


        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(300.0);
        ellipse.setCenterY(300.0);
        ellipse.setRadiusX(50.0);
        ellipse.setRadiusY(80.0);
        ellipse.setFill(Color.color(1.0, 0.0, 0.0, 1.0));

        ellipse.setOnMouseEntered(event -> {
            ellipse.setFill(Color.color(0.0, 1.0, 0.0, 1.0));
        });

        ellipse.setOnMouseExited(event -> {
            ellipse.setFill(Color.color(0.0, 0.0, 1.0, 1.0));
        });


        Group group2D = new Group(ellipse, lRect, rRect);
        root.getChildren().add(group2D);


        Scene scene = new Scene(root, 800, 600);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.W) {
                lRect.setTranslateY(lRect.getTranslateY() - 10);
            } else if (e.getCode() == KeyCode.S) {
                lRect.setTranslateY(lRect.getTranslateY() + 10);
            }
        });


        primaryStage.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal) {
                rRect.setFill(Color.color(1.0, 0.0, 0.0, 1.0));
            } else {
                rRect.setFill(Color.color(0.0, 1.0, 0.0, 1.0));
            }
        });

        primaryStage.setOnShowing(e -> {
            System.out.println("Zaraz okno zostanie wyświetlone!");
        });
        primaryStage.setOnShown(e -> {
            System.out.println("Okno właśnie zostało wyświetlone!");
        });

        primaryStage.setAlwaysOnTop(true);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}