import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

class Triangle extends Group {

  // Parameterloser Konstruktor (für JavaFX/SceneBuilder etc.)
  public Triangle() {
    super();
  }

  // Dein benutzerdefinierter Konstruktor
  public Triangle(Color color,
                  double x0, double y0,
                  double x1, double y1,
                  double x2, double y2) {
    super();
    Polygon tri = new Polygon(x0, y0, x1, y1, x2, y2);
    tri.setFill(color);
    getChildren().add(tri);
  }
}

public class DrawTriangle extends Application {

  @Override
  public void start(Stage stage) {
    double sceneWidth = 200, sceneHeight = 200;

    double x0 = 0, y0 = sceneHeight;
    double x1 = sceneWidth / 2, y1 = 0;
    double x2 = sceneWidth, y2 = sceneHeight;

    Triangle solid = new Triangle(Color.BLUE, x0, y0, x1, y1, x2, y2);

    Scene scene = new Scene(solid, sceneWidth, sceneHeight, Color.SNOW);
    stage.setTitle("Solid Triangle");
    stage.setScene(scene);
    stage.show();
  }
}
