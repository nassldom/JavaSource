import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Random;

public class Blizzard extends Application {
    private Random rand = new Random();

    private void drawBranch(Group gr, double x1, double y1, double length, double angle, int level, Color color, double stroke) {
        if (level == 0 || length < 4) {
            return;
        }

        double x2 = x1 + length * Math.cos(Math.toRadians(angle));
        double y2 = y1 + length * Math.sin(Math.toRadians(angle));

        Line line = new Line(x1, y1, x2, y2);
        line.setStroke(color);
        line.setStrokeWidth(stroke);
        gr.getChildren().add(line);

        drawBranch(gr, x2, y2, length * 0.45, angle - 35, level - 1, color, Math.max(0.5, stroke * 0.75));
        drawBranch(gr, x2, y2, length * 0.45, angle + 35, level - 1, color, Math.max(0.5, stroke * 0.75));
    }

    private void drawSnowflake(Group gr, double cx, double cy, double size, Color color) {
        double stroke = Math.max(0.7, size / 18.0);

        for (int k = 0; k < 6; k++) {
            drawBranch(gr, cx, cy, size, k * 60, 4, color, stroke);
        }
    }

    public void start(Stage stage) {
        Group root = new Group();

        for (int i = 0; i < 35; i++) {
            double x = 20 + rand.nextDouble() * 760;
            double y = 20 + rand.nextDouble() * 560;
            double size = 10 + rand.nextDouble() * 45;

            Color color = Color.hsb(
                    180 + rand.nextDouble() * 60,
                    0.15 + rand.nextDouble() * 0.35,
                    0.8 + rand.nextDouble() * 0.2
            );

            drawSnowflake(root, x, y, size, color);
        }

        Scene scene = new Scene(root, 800, 600, Color.rgb(10, 20, 40));
        stage.setTitle("Blizzard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}