package zti;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebView_Example_2 extends Application {
    @Override
    public void start(Stage primaryStage) {

        WebView webView = new WebView();
        WebEngine webengine = webView.getEngine();

        webengine.setJavaScriptEnabled(true);
        webengine.load(getClass().getResource("HTMLExample.html").toString());


        Button js = new Button();
        js.setText("Skrypt Javascript");
        js.setOnAction(e -> {
            webengine.executeScript("test()");
        });


        StackPane root = new StackPane();
        HBox hh = new HBox();
        hh.getChildren().add(js);
        hh.getChildren().add(webView);


        root.getChildren().add(hh);
        Scene scene = new Scene(root, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}