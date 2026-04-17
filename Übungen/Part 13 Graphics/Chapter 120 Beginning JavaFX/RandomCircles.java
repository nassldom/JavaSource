import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class RandomCircles extends Application {

    private static final int N = 50;
    private static final double WIDTH = 600;
    private static final double HEIGHT = 400;
    private static final double MIN_RADIUS = 10;
    private static final double MAX_RADIUS = 40;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            double radius = MIN_RADIUS + rand.nextDouble() * (MAX_RADIUS - MIN_RADIUS);

            double x = radius + rand.nextDouble() * (WIDTH - 2 * radius);
            double y = radius + rand.nextDouble() * (HEIGHT - 2 * radius);

            Color color = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());

            Circle c = new Circle(x, y, radius);
            c.setFill(color);
            c.setStroke(Color.BLACK);
            c.setStrokeWidth(1);

            root.getChildren().add(c);
        }

        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITESMOKE);
        stage.setTitle("Random Circles");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}