import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class Pacman extends Application {

    @Override
    public void start(Stage primaryStage) {
        final double width = 200.0, height = 200.0;
        double centerX = width / 2, centerY = height / 2;
        double radiusX = width * 0.4, radiusY = width * 0.4;
        double startAngle = 20.0;
        double length = 360.0 - 2 * startAngle;

        Arc arc = new Arc(centerX, centerY, radiusX, radiusY, startAngle, length);
        arc.setFill(Color.YELLOW); 
        arc.setType(ArcType.ROUND);

        Pane pane = new Pane(arc);
        Scene scene = new Scene(pane, width, height, Color.BLACK);

        primaryStage.setTitle("Pac Man");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
