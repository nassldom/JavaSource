import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CylinderExercise extends Application {

    @Override
    public void start(Stage stage) {
        double unit = 120.0;
        double cylWidth = unit;
        double cylHeight = unit;
        double endRadiusX = unit / 2.0;
        double endRadiusY = unit / 6.0;

        Rectangle body = new Rectangle(0, endRadiusY, cylWidth, cylHeight - 2 * endRadiusY);
        body.setFill(Color.LIGHTSTEELBLUE);
        body.setStroke(Color.DARKSLATEGRAY);
        body.setStrokeWidth(2);

        Ellipse top = new Ellipse(cylWidth / 2.0, endRadiusY, endRadiusX, endRadiusY);
        top.setFill(Color.ALICEBLUE);
        top.setStroke(Color.DARKSLATEGRAY);
        top.setStrokeWidth(2);

        Ellipse bottom = new Ellipse(cylWidth / 2.0, cylHeight - endRadiusY, endRadiusX, endRadiusY);
        bottom.setFill(Color.LIGHTSTEELBLUE);
        bottom.setStroke(Color.TRANSPARENT);

        Arc frontBottom = new Arc(cylWidth / 2.0, cylHeight - endRadiusY, endRadiusX, endRadiusY, 180, 180);
        frontBottom.setType(ArcType.OPEN);
        frontBottom.setStroke(Color.DARKSLATEGRAY);
        frontBottom.setStrokeWidth(2);
        frontBottom.setFill(Color.TRANSPARENT);

        Group cylinder = new Group(body, bottom, top, frontBottom);

        double sceneWidth = 400;
        double sceneHeight = 300;

        cylinder.setTranslateX((sceneWidth - cylWidth) / 2.0);
        cylinder.setTranslateY((sceneHeight - cylHeight) / 2.0);

        Pane root = new Pane(cylinder);
        Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.WHITESMOKE);

        stage.setScene(scene);
        stage.setTitle("Cylinder");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}