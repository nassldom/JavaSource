import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class ArcSimple extends Application {

    @Override
    public void start(Stage primaryStage) {
        final double width = 400.0, height = 300.0;
        double centerX, centerY;  // center of ellipse and arc
        double radiusX, radiusY;  // radii of ellipse and arc
        double startAngle = 15.0; // angle to start drawing the arc
        double length = 90.0;     // number of degrees to draw

        centerX = width / 2;
        centerY = height / 2;
        radiusX = width * 0.4;
        radiusY = width * 0.3;

        Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
        ellipse.setFill(Color.IVORY);

        Arc arc = new Arc(centerX, centerY, radiusX, radiusY, startAngle, length);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.RED);
        arc.setType(ArcType.ROUND);
        arc.setStrokeWidth(2.0);

        Pane pane = new Pane(ellipse, arc);
        Scene scene = new Scene(pane, width, height, Color.LIGHTGREY);

        primaryStage.setTitle("Arc and its Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
