import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.util.Random;

public class RotatedEllipses extends Application {

    private static final int N = 18;
    private static final double WIDTH = 500;
    private static final double HEIGHT = 500;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Random rand = new Random();

        double cx = WIDTH / 2.0;
        double cy = HEIGHT / 2.0;
        double rx = 150;
        double ry = 60;

        for (int i = 0; i < N; i++) {
            Ellipse e = new Ellipse(cx, cy, rx, ry);
            e.setFill(Color.TRANSPARENT);
            e.setStroke(Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble()));
            e.setStrokeWidth(2);
            e.setRotate(i * (180.0 / N));

            root.getChildren().add(e);
        }

        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Rotated Ellipses");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}