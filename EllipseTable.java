import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;

public class EllipseTable extends Application {

    @Override
    public void start(Stage primaryStage) {
        double width = 400.0, height = 300.0;
        double centerX, centerY;
        double radiusX, radiusY;

        // First ellipse, width greater than height
        centerX = width * 0.3; centerY = height * 0.3;
        radiusX = width / 8;   radiusY = width / 11;
        Ellipse billiardA = new Ellipse(centerX, centerY, radiusX, radiusY);
        billiardA.setFill(Color.IVORY);

        // Second ellipse, height greater than width
        centerX = width * 0.7; centerY = height * 0.7;
        radiusX = width / 12;  radiusY = width / 10;
        Ellipse billiardB = new Ellipse(centerX, centerY, radiusX, radiusY);
        billiardB.setFill(Color.IVORY);

        // Green rectangle background
        Rectangle table = new Rectangle(0, 0, width, height);
        table.setFill(new Color(0.228, 0.71, 0.05, 1.0));  // Baize green
        table.setStroke(Color.DIMGRAY);
        table.setStrokeWidth(5.0);

        Pane pane = new Pane(table, billiardA, billiardB);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Elliptical Billiard Balls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
