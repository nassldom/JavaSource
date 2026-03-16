import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class PolylineDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 400.0, sceneHeight = 200.0;

        double[] vertices = {
            25, 75, 75, 125, 125, 50, 100, 15, 200, 60,
            225, 150, 300, 25, 235, 55, 340, 90, 375, 50
        };

        Polyline line = new Polyline(vertices);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(2.4);

        Pane pane = new Pane(line);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.ALICEBLUE);

        primaryStage.setTitle("Polyline Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
