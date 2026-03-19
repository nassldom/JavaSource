import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class DrawBarBell extends Application {

  void addBarBell(Group root, double centerX, double centerY, double size, double degrees) {
    Group bb = new Group();   // Semikolon ergänzt

    // Make a horizontal bar
    Line bar = new Line(centerX - size / 2, centerY, centerX + size / 2, centerY);
    bar.setStrokeWidth(8.0);
    bar.setStroke(Color.SILVER);
    bb.getChildren().add(bar);

    // Make a circle
    double radius = size / 6.0;
    Circle leftBell  = new Circle(centerX - size / 2, centerY, radius, Color.DARKSLATEGREY);
    bb.getChildren().add(leftBell);

    // Make another circle
    Circle rightBell = new Circle(centerX + size / 2, centerY, radius, Color.DARKSLATEGREY);
    bb.getChildren().add(rightBell);

    // Put the barbell Group into the root
    root.getChildren().add(bb);
  }

  @Override
  public void start(Stage stage) {
    double sceneWidth = 400, sceneHeight = 300;

    Group root = new Group();
    addBarBell(root, sceneWidth / 2, sceneHeight / 2, sceneWidth * 0.7, 30.0);

    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.BLANCHEDALMOND);
    stage.setTitle("Bar Bell");
    stage.setScene(scene);
    stage.show();

  }
}
