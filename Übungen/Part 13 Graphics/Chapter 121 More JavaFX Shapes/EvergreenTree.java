import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EvergreenTree extends Application {

    @Override
    public void start(Stage stage) {
        double width = 500;
        double height = 400;

        Pane root = new Pane();

        Polygon ground = new Polygon(
                0.0, 320.0,
                500.0, 320.0,
                500.0, 400.0,
                0.0, 400.0
        );
        ground.setFill(Color.DARKSEAGREEN);

        Circle sun = new Circle(420, 70, 35, Color.GOLD);

        for (int i = 0; i < 12; i++) {
            double angle = 2 * Math.PI * i / 12;
            double x1 = 420 + 45 * Math.cos(angle);
            double y1 = 70 + 45 * Math.sin(angle);
            double x2 = 420 + 65 * Math.cos(angle);
            double y2 = 70 + 65 * Math.sin(angle);

            Line ray = new Line(x1, y1, x2, y2);
            ray.setStroke(Color.GOLDENROD);
            ray.setStrokeWidth(3);
            root.getChildren().add(ray);
        }

        Rectangle trunk = new Rectangle(220, 240, 60, 90);
        trunk.setFill(Color.SADDLEBROWN);

        Polygon t1 = new Polygon(
                250.0, 90.0,
                180.0, 180.0,
                320.0, 180.0
        );
        t1.setFill(Color.FORESTGREEN);

        Polygon t2 = new Polygon(
                250.0, 140.0,
                165.0, 235.0,
                335.0, 235.0
        );
        t2.setFill(Color.GREEN);

        Polygon t3 = new Polygon(
                250.0, 190.0,
                150.0, 290.0,
                350.0, 290.0
        );
        t3.setFill(Color.DARKGREEN);

        root.getChildren().addAll(ground, sun, trunk, t1, t2, t3);

        Scene scene = new Scene(root, width, height, Color.SKYBLUE);
        stage.setScene(scene);
        stage.setTitle("Evergreen Tree");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}