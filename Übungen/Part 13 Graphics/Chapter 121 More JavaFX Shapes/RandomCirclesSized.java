import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class RandomCirclesSized extends Application {

    private static final int N = 40;
    private static final double WIDTH = 700;
    private static final double HEIGHT = 450;
    private static final double MAX_R = 40;
    private static final double MIN_R = 8;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            double t = (N == 1) ? 0 : (double) i / (N - 1);
            double radius = MAX_R - t * (MAX_R - MIN_R);

            double x = radius + rand.nextDouble() * (WIDTH - 2 * radius);
            double y = radius + rand.nextDouble() * (HEIGHT - 2 * radius);

            Color fill = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());

            Circle c = new Circle(x, y, radius);
            c.setFill(fill);
            c.setStroke(fill.darker());
            c.setStrokeWidth(2);

            root.getChildren().add(c);
        }

        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITESMOKE);
        stage.setScene(scene);
        stage.setTitle("Random Circles");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}