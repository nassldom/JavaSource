import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;

public class CircleOverlap extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circleA = new Circle(75.0, 75.0, 50.0);
        circleA.setFill(new Color(0.0, 1.0, 0.0, 0.5));  // RGBA
        circleA.setStroke(Color.BLACK);

        Circle circleB = new Circle(150.0, 75.0, 50.0);
        circleB.setFill(new Color(0.0, 0.0, 1.0, 0.5));  // RGBA
        circleB.setStroke(Color.BLACK);

        Pane pane = new Pane(circleA, circleB);
        Scene scene = new Scene(pane, 300.0, 200.0, Color.LIGHTYELLOW);

        primaryStage.setTitle("Overlapping Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
