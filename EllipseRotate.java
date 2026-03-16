import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class EllipseRotate extends Application {

    @Override
    public void start(Stage primaryStage) {
        double width  = 400.0, height = 350.0;
        double centerX = width / 2;
        double centerY = height / 2;
        double radiusX = width / 3;
        double radiusY = height / 4;

        Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
        ellipse.setFill(Color.AQUA);
        ellipse.setRotate(30.0);  // rotation in degrees

        Pane pane = new Pane(ellipse);
        Scene scene = new Scene(pane, width, height, Color.CORNSILK);

        primaryStage.setTitle("Rotate Ellipse 30 deg clockwise");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
