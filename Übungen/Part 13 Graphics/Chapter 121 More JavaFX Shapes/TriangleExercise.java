import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleExercise extends Application {

    private static final double WIDTH = 400;
    private static final double HEIGHT = 300;

    @Override
    public void start(Stage stage) {
        double x1 = WIDTH / 4.0;
        double y1 = 3 * HEIGHT / 4.0;

        double x2 = 3 * WIDTH / 4.0;
        double y2 = 3 * HEIGHT / 4.0;

        double x3 = WIDTH / 2.0;
        double y3 = HEIGHT / 4.0;

        Polygon triangle = new Polygon(
                x1, y1,
                x2, y2,
                x3, y3
        );
        triangle.setFill(Color.LIGHTSKYBLUE);
        triangle.setStroke(Color.DARKBLUE);
        triangle.setStrokeWidth(3);

        Pane root = new Pane(triangle);
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITESMOKE);

        stage.setScene(scene);
        stage.setTitle("Triangle");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
