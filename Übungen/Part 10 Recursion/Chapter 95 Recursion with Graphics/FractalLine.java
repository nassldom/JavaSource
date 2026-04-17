import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Random;

public class FractalLine extends Application {
    private Random rand = new Random();

    private void drawLine(Group gr, double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double length = Math.sqrt(dx * dx + dy * dy);

        if (length < 12) {
            Line line = new Line(x1, y1, x2, y2);
            line.setStroke(Color.NAVY);
            gr.getChildren().add(line);
            return;
        }

        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;

        double dither = length * 0.12;
        midX = midX + (rand.nextDouble() * 2 - 1) * dither;
        midY = midY + (rand.nextDouble() * 2 - 1) * dither;

        drawLine(gr, x1, y1, midX, midY);
        drawLine(gr, midX, midY, x2, y2);
    }

    public void start(Stage stage) {
        Group root = new Group();
        drawLine(root, 40, 180, 560, 180);

        Scene scene = new Scene(root, 600, 360, Color.WHITESMOKE);
        stage.setTitle("Fractal Line");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}