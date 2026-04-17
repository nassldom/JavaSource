import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Asterisk extends Application {

    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    private static final int NUM_LINES = 5;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        double cx = WIDTH / 2.0;
        double cy = HEIGHT / 2.0;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;

        for (int i = 0; i < NUM_LINES; i++) {
            double angle = 2 * Math.PI * i / NUM_LINES;

            double x = cx + radius * Math.cos(angle);
            double y = cy + radius * Math.sin(angle);

            Line line = new Line(cx, cy, x, y);
            line.setStroke(Color.DARKSLATEBLUE);
            line.setStrokeWidth(3);
            root.getChildren().add(line);
        }

        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.BEIGE);
        stage.setTitle("Asterisk");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}