import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GraphPaper extends Application {

    private static final double WIDTH_IN = 8.0;
    private static final double HEIGHT_IN = 10.5;
    private static final double DPI = 72;

    private static final double GRID_SPACING_IN = 0.25;

    @Override
    public void start(Stage stage) {
        double widthPx = WIDTH_IN * DPI;
        double heightPx = HEIGHT_IN * DPI;
        double spacingPx = GRID_SPACING_IN * DPI;

        Pane root = new Pane();

        for (double x = 0; x <= widthPx; x += spacingPx) {
            Line v = new Line(x, 0, x, heightPx);
            v.setStroke(Color.LIGHTGRAY);
            v.setStrokeWidth(1);
            root.getChildren().add(v);
        }

        for (double y = 0; y <= heightPx; y += spacingPx) {
            Line h = new Line(0, y, widthPx, y);
            h.setStroke(Color.LIGHTGRAY);
            h.setStrokeWidth(1);
            root.getChildren().add(h);
        }

        Scene scene = new Scene(root, widthPx, heightPx, Color.WHITE);
        stage.setTitle("Graph Paper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}