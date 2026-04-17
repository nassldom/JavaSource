import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FourCircles extends Application {

    private static final double RADIUS = 60;

    @Override
    public void start(Stage stage) {
        double sceneWidth = RADIUS * 4;
        double sceneHeight = RADIUS * 4;

        double cx1 = sceneWidth / 4.0;
        double cy1 = sceneHeight / 4.0;

        double cx2 = 3 * sceneWidth / 4.0;
        double cy2 = sceneHeight / 4.0;

        double cx3 = sceneWidth / 4.0;
        double cy3 = 3 * sceneHeight / 4.0;

        double cx4 = 3 * sceneWidth / 4.0;
        double cy4 = 3 * sceneHeight / 4.0;

        Circle c1 = new Circle(cx1, cy1, RADIUS, Color.CORNFLOWERBLUE);
        Circle c2 = new Circle(cx2, cy2, RADIUS, Color.CRIMSON);
        Circle c3 = new Circle(cx3, cy3, RADIUS, Color.MEDIUMSEAGREEN);
        Circle c4 = new Circle(cx4, cy4, RADIUS, Color.GOLDENROD);

        Group root = new Group(c1, c2, c3, c4);

        Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.BEIGE);
        stage.setTitle("Four Circles");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}