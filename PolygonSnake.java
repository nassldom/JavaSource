import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class PolygonSnake extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 550.0, sceneHeight = 200.0;

        double[] snake = {
            30, 150, 150, 60, 240, 90, 360, 30, 450, 90, 480, 60, 510, 90,
            480, 120, 450, 105, 360, 60, 240, 120, 150, 78
        };

        Polygon polygon = new Polygon(snake);
        polygon.setFill(Color.GREENYELLOW);

        Ellipse eye = new Ellipse(480, 83, 5, 3);
        eye.setFill(Color.BLACK);

        Line line1 = new Line(490, 105, 510, 115);
        line1.setStroke(Color.RED);
        line1.setStrokeWidth(1.5);

        Line line2 = new Line(510, 115, 525, 110);
        line2.setStroke(Color.RED);
        line2.setStrokeWidth(1.5);

        Line line3 = new Line(510, 115, 520, 130);
        line3.setStroke(Color.RED);
        line3.setStrokeWidth(1.5);

        Pane pane = new Pane(line1, line2, line3, polygon, eye);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.HONEYDEW);

        primaryStage.setTitle("Irregular Polygon Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
