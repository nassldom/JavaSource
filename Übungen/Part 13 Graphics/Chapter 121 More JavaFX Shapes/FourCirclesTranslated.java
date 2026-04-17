import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FourCirclesTranslated extends Application {

    private static final double RADIUS = 50;

    @Override
    public void start(Stage stage) {
        double size = 4 * RADIUS;

        Circle c1 = new Circle(0, 0, RADIUS, Color.CRIMSON);
        Circle c2 = new Circle(0, 0, RADIUS, Color.DODGERBLUE);
        Circle c3 = new Circle(0, 0, RADIUS, Color.MEDIUMSEAGREEN);
        Circle c4 = new Circle(0, 0, RADIUS, Color.GOLD);

        c1.setTranslateX(size / 4.0);
        c1.setTranslateY(size / 4.0);

        c2.setTranslateX(3 * size / 4.0);
        c2.setTranslateY(size / 4.0);

        c3.setTranslateX(size / 4.0);
        c3.setTranslateY(3 * size / 4.0);

        c4.setTranslateX(3 * size / 4.0);
        c4.setTranslateY(3 * size / 4.0);

        Group root = new Group(c1, c2, c3, c4);
        Scene scene = new Scene(root, size, size, Color.BEIGE);

        stage.setScene(scene);
        stage.setTitle("Four Circles");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
