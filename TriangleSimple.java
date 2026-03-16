import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class TriangleSimple extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 400.0, sceneHeight = 300.0;

        Polygon triangle = new Polygon(0, 300.0, 400.0, 300.0, 200.0, 0);
        triangle.setFill(new Color(0.8, 0.2, 0.1, 1.0));

        Pane pane = new Pane(triangle);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.FLORALWHITE);

        primaryStage.setTitle("Simple Triangle Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
