import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class RegularPolygon extends Application {

    int N = 6; // z.B. Hexagon

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 400.0, sceneHeight = 300.0;
        double sceneCenterX = sceneWidth / 2;
        double sceneCenterY = sceneHeight / 2;

        double radius = Math.min(sceneWidth, sceneHeight) * 0.45;

        double[] vertices = new double[2 * N];

        for (int j = 0; j < N; j++) {
            double theta = j * 2 * Math.PI / N + Math.PI / 2;
            double x =  radius * Math.cos(theta) + sceneCenterX;
            double y = -radius * Math.sin(theta) + sceneCenterY;
            vertices[2 * j]     = x;
            vertices[2 * j + 1] = y;
        }

        Polygon polygon = new Polygon(vertices);
        polygon.setFill(Color.GREENYELLOW);

        Line xAxis = new Line(0, sceneCenterY, sceneWidth, sceneCenterY);
        xAxis.setStroke(Color.LIGHTGRAY);
        Line yAxis = new Line(sceneCenterX, 0, sceneCenterX, sceneHeight);
        yAxis.setStroke(Color.LIGHTGRAY);

        Pane pane = new Pane(polygon, xAxis, yAxis);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.LAVENDERBLUSH);

        primaryStage.setTitle("Regular Polygon Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
