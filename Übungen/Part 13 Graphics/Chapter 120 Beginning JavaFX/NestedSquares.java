import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class NestedSquares extends Application {

    private static final int N = 8;
    private static final double INNER_SIZE = 10;
    private static final double MARGIN = 5;

    @Override
    public void start(Stage stage) {
        double size = INNER_SIZE + 2 * MARGIN * (N - 1);

        Pane root = new Pane();

        for (int i = 0; i < N; i++) {
            double rectSize = INNER_SIZE + 2 * MARGIN * i;
            double x = (size - rectSize) / 2.0;
            double y = (size - rectSize) / 2.0;

            Rectangle r = new Rectangle(x, y, rectSize, rectSize);
            r.setFill(Color.TRANSPARENT);
            r.setStroke(Color.DARKSLATEGRAY);
            r.setStrokeWidth(1.5);

            root.getChildren().add(r);
        }

        Scene scene = new Scene(root, size, size, Color.ALICEBLUE);
        stage.setTitle("Nested Squares");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}