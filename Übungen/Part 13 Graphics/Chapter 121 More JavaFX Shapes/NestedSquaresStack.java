import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class NestedSquaresStack extends Application {

    private static final int N = 10;
    private static final double GAP = 8;

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Random rand = new Random();

        double innerSize = 2 * GAP;
        double outerSize = innerSize + 2 * GAP * (N - 1);

        for (int i = N - 1; i >= 0; i--) {
            double size = innerSize + 2 * GAP * i;

            Rectangle r = new Rectangle(size, size);
            r.setFill(Color.TRANSPARENT);
            r.setStroke(Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble()));
            r.setStrokeWidth(2);

            root.getChildren().add(r);
        }

        Scene scene = new Scene(root, outerSize + 40, outerSize + 40, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Nested Squares");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}