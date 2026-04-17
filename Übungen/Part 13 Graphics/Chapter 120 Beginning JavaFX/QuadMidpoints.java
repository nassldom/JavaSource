import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class QuadMidpoints extends Application {

    private static final double SCENE_WIDTH = 400;
    private static final double SCENE_HEIGHT = 300;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        double w = SCENE_WIDTH;
        double h = SCENE_HEIGHT;

        double midTopX = w / 2.0;
        double midTopY = 0;

        double midRightX = w;
        double midRightY = h / 2.0;

        double midBottomX = w / 2.0;
        double midBottomY = h;

        double midLeftX = 0;
        double midLeftY = h / 2.0;

        Line topRight = new Line(midTopX, midTopY, midRightX, midRightY);
        Line rightBottom = new Line(midRightX, midRightY, midBottomX, midBottomY);
        Line bottomLeft = new Line(midBottomX, midBottomY, midLeftX, midLeftY);
        Line leftTop = new Line(midLeftX, midLeftY, midTopX, midTopY);

        for (Line line : new Line[]{topRight, rightBottom, bottomLeft, leftTop}) {
            line.setStroke(Color.DODGERBLUE);
            line.setStrokeWidth(3.0);
        }

        root.getChildren().addAll(topRight, rightBottom, bottomLeft, leftTop);

        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.WHITESMOKE);
        stage.setTitle("Quadrilateral");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}