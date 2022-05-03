package zti;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class Shapes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shapes!");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Line line = new Line();
        line.setStartX(150.0f);
        line.setStartY(140.0f);
        line.setEndX(450.0f);
        line.setEndY(140.0f);


        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(300.0);
        ellipse.setCenterY(300.0);
        ellipse.setRadiusX(50.0);
        ellipse.setRadiusY(80.0);
        ellipse.setFill(Color.color(1.0, 0.0, 0.0, 1.0));
        

        Group group2D = new Group(line, ellipse);
        root.getChildren().add(group2D);


        Box box = new Box();

        box.setWidth(100.0);
        box.setHeight(100.0);
        box.setDepth(100.0);

        box.setTranslateX(250);
        box.setTranslateY(150);
        box.setTranslateZ(300);

        box.setDrawMode(DrawMode.FILL); //DrawMode.LINE

        root.getChildren().add(box);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);


        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(box);
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAxis(new Point3D(0.3, 0.4, 0.7));
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();


        Scene scene = new Scene(root, 800, 600);
        scene.setCamera(camera);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}