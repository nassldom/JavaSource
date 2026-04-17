import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectanglesScale extends Application {
    double sceneWidth = 500;
    double sceneHeight = 350;
    double centerX = sceneWidth / 2;
    double centerY = sceneHeight / 2;

    private void fillGroup(Group gr, double scale) {
        if (scale < 0.08) {
            return;
        }

        double width = sceneWidth * scale;
        double height = sceneHeight * scale;

        Rectangle rect = new Rectangle(
                centerX - width / 2,
                centerY - height / 2,
                width,
                height
        );

        rect.setStroke(Color.DARKBLUE);
        rect.setFill(Color.TRANSPARENT);
        rect.setStrokeWidth(2.0);

        gr.getChildren().add(rect);

        fillGroup(gr, scale * 0.85);
    }

    public void start(Stage stage) {
        Group root = new Group();
        fillGroup(root, 0.95);

        Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.ALICEBLUE);
        stage.setTitle("Recursive Rectangles - Scale");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}